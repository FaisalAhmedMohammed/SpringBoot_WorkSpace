package in.ahmed.repo;

import org.springframework.data.repository.CrudRepository;

import in.ahmed.entity.Customer;
import java.util.List;
import java.util.Optional;


public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	
	List<Customer> findByName(String name);
	
	Optional<Customer> findByCountryAndEmailId(String country,String emailId);
}
