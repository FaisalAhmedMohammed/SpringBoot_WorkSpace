package in.ahmed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ahmed.entity.Contact;
import in.ahmed.repo.ContactRepo;

@Service
public class ContactService {
	@Autowired
	private ContactRepo contactRepo;

	public void saveUser() {
		Contact contact = new Contact();
		contact.setName("ASHOK");
		contact.setEmail("ashok@123");
		contact.setPhNo(94877l);

		Contact save = contactRepo.save(contact);
	}
	/*
	 * public void deleteAll() { contactRepo.deleteAll(); }
	 */

}
