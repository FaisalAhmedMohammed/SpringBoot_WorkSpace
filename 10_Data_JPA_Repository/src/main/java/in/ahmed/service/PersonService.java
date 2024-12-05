package in.ahmed.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ahmed.entity.Person;
import in.ahmed.repo.PersonRepo;

@Service

public class PersonService {
	@Autowired
	private PersonRepo personRepo;

	public void SortByage() {

		Sort sort = Sort.by("age").descending();

		List<Person> all = personRepo.findAll(sort);

		all.forEach(e -> {
			System.out.println(e);
		});
	}

	public void getPersonPagenation() {
		int pageSize = 3;// how many records want in one page
		int pageNo = 1;// in future it will come from UI

		PageRequest of = PageRequest.of(pageNo - 1, pageSize);
		Page<Person> all = personRepo.findAll(of);
		List<Person> content = all.getContent();
		content.forEach(e -> {
			System.out.println(e);
		});
	}

	public void getPersonQBE(String gender, String country) {

		Person person = new Person();
		if (gender != null) {
			person.setGender(gender);
		}
		if (country != null) {
			person.setCountry(country);
		}
		Example<Person> of = Example.of(person);

		List<Person> all = personRepo.findAll(of);

		all.forEach(e -> {
			System.out.println(e);
		});

	}

	public void savePerson() {

		Person p1 = new Person(1, "RAJ", 22, "MALE", "INDIA", null, null);
		Person p2 = new Person(2, "RAM", 34, "MALE", "INDIA", null, null);
		Person p3 = new Person(3, "ALLEN", 21, "MALE", "USA", null, null);
		Person p4 = new Person(4, "SCOTT", 40, "MALE", "USA", null, null);
		Person p5 = new Person(5, "MILLER", 34, "MALE", "CANADA", null, null);
		Person p6 = new Person(6, "PANDU", 19, "FEMALE", "CANADA", null, null);
		Person p7 = new Person(7, "RUTHIKA", 24, "FEMALE", "INDIA", null, null);
		Person p8 = new Person(8, "AHMED", 25, "MALE", "INDIA", null, null);

		List<Person> asList = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);

		personRepo.saveAll(asList);

	}

}
