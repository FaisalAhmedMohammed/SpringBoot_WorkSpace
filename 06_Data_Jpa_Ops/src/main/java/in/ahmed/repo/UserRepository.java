package in.ahmed.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import in.ahmed.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	// public List<User> findByCountry(String Country);

	// public List<User> findByCountryAndGender(String Country, String Gender);

	// public List<User> findBySalaryGreaterThan(Double salary);
	// @Query(" From User ")
	// public List<User> getAllUsersHQ();

	//@Query("SELECT u FROM User u WHERE u.id = :n")
	//public List<User> getUserByIdHQL(@Param("n") Integer id);
	

}
