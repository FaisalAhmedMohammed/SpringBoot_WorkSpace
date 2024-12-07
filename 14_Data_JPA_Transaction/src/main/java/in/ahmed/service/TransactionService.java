package in.ahmed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ahmed.entity.Contact;
import in.ahmed.entity.Person;
import in.ahmed.repo.ContactRepo;
import in.ahmed.repo.PersonRepo;
import jakarta.transaction.Transactional;

@Service
public class TransactionService {
	@Autowired
	private PersonRepo personRepo;
	@Autowired
	private ContactRepo contactRepo;
	@Transactional(rollbackOn = Exception.class)//when ever an exception occur it will automatically rollbacked
	public void saveUser() {
		Person person = new Person();
		person.setName("ashok");
		person.setGender("male");

		personRepo.save(person);//automatically commited

		int i = 10 / 0; //throws arithmetic Exception

		Contact contact = new Contact();
		contact.setName("raj");
		contact.setEmail("raj@123");
		contact.setCountry("inida");

		contactRepo.save(contact);

	}

}
