package in.ahmed.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ahmed.Repo.AadharRepo;
import in.ahmed.Repo.PersonRepo;
import in.ahmed.entity.Aadhar;
import in.ahmed.entity.Person;

@Service
public class PersonAadharService {

	@Autowired
	private PersonRepo personRepo;
	@Autowired
	private AadharRepo aadharRepo;

	public void saveUser() {

		Person person = new Person();
		person.setPersonName("faial");
		person.setGeder("male");

		Person personEntiry = personRepo.save(person);

		Aadhar aadhar = new Aadhar();
		aadhar.setAadherNum("#3455DGR23");
		aadhar.setIssueDate(LocalDate.now().minusYears(20));
		aadhar.setExpiDate(LocalDate.now().plusYears(70));

		aadhar.setPerson(personEntiry);

		aadharRepo.save(aadhar);
	}

	public void getPerson() {
		Optional<Person> byId = personRepo.findById(1);
		if (byId.isPresent()) {
			System.out.println(byId.get());
		}
	}

	public void getAadhar() {
		Optional<Aadhar> byId = aadharRepo.findById(1);
		if (byId.isPresent()) {
			System.out.println(byId.get());
		}

	}
	
	public void deletePerson() {
		personRepo.deleteById(1);
	}
	
	public void delteAadhar() {
		aadharRepo.deleteById(1);
	}

}
