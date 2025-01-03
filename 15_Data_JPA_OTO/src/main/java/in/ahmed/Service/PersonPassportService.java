package in.ahmed.Service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ahmed.entity.Passport;
import in.ahmed.entity.Person;
import in.ahmed.repo.PassportRepo;
import in.ahmed.repo.PersonRepo;

@Service
public class PersonPassportService {

	@Autowired
	private PersonRepo personRepo;

	@Autowired
	private PassportRepo passportRepo;

	public void saveUser() {

		Person person = new Person();
		person.setPersonName("fasial");
		person.setGender("male");

		Person savedPerson = personRepo.save(person); // first we have to save the person object

		Passport passport = new Passport();
		passport.setPasspordNum("YTEE23DE");
		passport.setIssuedAt(LocalDate.now());
		passport.setExpireAt(LocalDate.now().plusYears(15));

		passport.setPerson(savedPerson);// passport belongs to person so to establish relation between them we are
										// setting the
										// passport object to person object

		passportRepo.save(passport);// then iam calling saving passport

	}

	public void deletePerson(Integer personId) {
		personRepo.deleteById(personId);
	}

	public void deletePassport(Integer passpordId) {
		passportRepo.deleteById(passpordId);

	}

	public void getPerson(Integer personId) {
		Optional<Person> byId = personRepo.findById(personId);
		if (byId.isPresent()) {
			System.out.println(byId.get());
		} else {
			System.out.println("Perosn Not Found");
		}
	}

}
