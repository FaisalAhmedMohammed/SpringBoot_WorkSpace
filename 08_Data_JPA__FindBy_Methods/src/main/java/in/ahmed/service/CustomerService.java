package in.ahmed.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import ch.qos.logback.core.pattern.color.CyanCompositeConverter;
import in.ahmed.entity.Customer;
import in.ahmed.repo.CustomerRepository;

@Service
public class CustomerService {

	private CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	public void saveUser() {
		Customer customer = new Customer();
		customer.setId(101);
		customer.setName("RAMESH");
		customer.setEmailId("ramesh@123");
		customer.setCountry("INDIA");

		Customer customer2 = new Customer();
		customer2.setId(102);
		customer2.setName("SURESH");
		customer2.setEmailId("suresh@123");
		customer2.setCountry("INDIA");

		Customer customer3 = new Customer();
		customer3.setId(103);
		customer3.setName("ALLEN");
		customer3.setEmailId("allen@123");
		customer3.setCountry("USA");

		Customer customer4 = new Customer();
		customer4.setId(104);
		customer4.setName("SCOTT");
		customer4.setEmailId("scott@123");
		customer4.setCountry("USA");
		List<Customer> asList = Arrays.asList(customer, customer2, customer3, customer4);
		customerRepository.saveAll(asList);
	}

	public void getName(String name) // The name to search for in the database.
	{
		List<Customer> byName = customerRepository.findByName(name);// To retrieve a list of Customer entities whose
		for (Customer customer : byName) { // name matches the given parameter
			System.out.println(customer);
		}
	}
		
		
		public Optional<Customer> findCoustomer(String country, String emailId) {
	         Optional<Customer> byCountryAndEmailId = customerRepository.findByCountryAndEmailId(country, emailId);
	         return byCountryAndEmailId;
	    }

}
