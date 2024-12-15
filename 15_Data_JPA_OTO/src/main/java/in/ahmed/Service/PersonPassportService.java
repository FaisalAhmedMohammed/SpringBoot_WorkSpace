package in.ahmed.Service;

import java.sql.Date;
import java.time.LocalDate;

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
	 
	 
	 public  void saveUser() {
		 
		 Person person =new Person();
		 person.setPersonName("ashok");
		 person.setGender("male");
		 Person personEntity = personRepo.save(person);
		 
		 
		 
		 Passport passport =new Passport();
		 passport.setPasspordNum("HGD123df");
		 passport.setIssuedAt(LocalDate.now());
		 passport.setExpireAt(LocalDate.now().plusYears(10));
		 
		 passport.setPerson(personEntity);
		 
		 passportRepo.save(passport);
		 
		 
	 }

}
