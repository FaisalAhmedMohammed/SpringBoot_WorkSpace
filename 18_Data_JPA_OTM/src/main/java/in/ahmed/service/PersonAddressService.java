package in.ahmed.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ahmed.entity.Address;
import in.ahmed.entity.Person;
import in.ahmed.repo.AddressRepo;
import in.ahmed.repo.PersonRepo;

@Service
public class PersonAddressService {
	@Autowired
	private PersonRepo personRepo;
	@Autowired
	private AddressRepo addressRepo;

	public void saveUser() {
		Person person = new Person();
		person.setName("ahmed");
		person.setSalary(2000.0);

		Address address = new Address();
		address.setCity("hyd");
		address.setState("tg");
		address.setCountry("india");

		Address address2 = new Address();
		address2.setCity("bng");
		address2.setState("ka");
		address2.setCountry("india");

		List<Address> asList = Arrays.asList(address, address2);

		person.setAddress(asList);

		address.setPerson(person);
		address2.setPerson(person);

		personRepo.save(person);

	}

}
