package in.ahmed.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ahmed.entity.Person;
import in.ahmed.repo.PersonRepository;
@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;
	
	public void SaveUser() {
		Person person1=new Person("Siva", "MALE", "INDIA", "ahmed@123");
		Person person2=new Person("faisal", "MALE", "INDIA", "ahmed@123");
		
		List<Person> asList = Arrays.asList(person1,person2);
		personRepository.saveAll(asList);
		
				
	}
	

}
