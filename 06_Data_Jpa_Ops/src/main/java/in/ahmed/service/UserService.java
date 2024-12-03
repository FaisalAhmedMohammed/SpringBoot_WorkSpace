package in.ahmed.service;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ahmed.entity.User;
import in.ahmed.repo.UserRepository;

@Service
public class UserService {

	private UserRepository userRepos;

	public UserService(UserRepository userRepos) {
		this.userRepos = userRepos;
	}

	public void deleteAll() {
		userRepos.deleteAll();
	}

	public void saveUsers() {
		User u1 = new User();
		u1.setId(101);
		u1.setName("SCOTT");
		u1.setGender("MALE");
		u1.setCountry("USA");

		User u2 = new User();
		u2.setId(102);
		u2.setName("MILLER");
		u2.setGender("MALE");
		u2.setCountry("UK");

		User u3 = new User();
		u3.setId(104);
		u3.setName("KATHEY");
		u3.setGender("FEMALE");
		u3.setCountry("INDIA");

		List<User> asList = Arrays.asList(u1, u2, u3);// convert your objects into list
		userRepos.saveAll(asList);// converted list i am passing to saveAll method

	}

	/*
	 * public void getUserByCountryAndGender(String Country, String Gender) {
	 * 
	 * List<User> byCountry = userRepos.findByCountryAndGender(Country, Gender); for
	 * (User c : byCountry) { System.out.println(c); }
	 * 
	 * }
	 */
	/*
	 * public void getUSerBySalaryGreaterThanEquals(Double salary) { List<User>
	 * bySalary = userRepos.findBySalaryGreaterThan(salary); for (User user :
	 * bySalary) { System.out.println(user); }
	 * 
	 * }
	 */

	/*
	 * public void getAllUsersHQ() { List<User> allUsersHQ =
	 * userRepos.getAllUsersHQ(); for(User user :allUsersHQ) {
	 * System.out.println(user); }
	 * 
	 * 
	 * }
	 */
	/*
	 * public void getUserByIdHQL(Integer id) {
	 * 
	 * List<User> uSerByIdHQL = userRepos.getUserByIdHQL(id);
	 * 
	 * for(User u : uSerByIdHQL) {
	 * 
	 * System.out.println(u); }
	 * 
	 * }
	 */


	/*
	 * public void getUserById(Integer id) { Optional<User> byId =
	 * userRepos.findById(id); if (byId.isPresent()) {
	 * System.out.println(byId.get()); } else { System.out.println("no id found"); }
	 * 
	 * }
	 */

	/*
	 * public void getAllUsers() { Iterable<User> all = userRepos.findAll(); for
	 * (User u : all) { System.out.println(u); } }
	 */
	/*
	 * public void saveUser() { System.out.println(userRepos.getClass().getName());
	 * 
	 * User u = new User(); u.setId(103); u.setName("ANAS"); u.setGender("MALE");
	 * u.setCountry("INDIA");
	 * 
	 * userRepos.save(u);
	 * 
	 * }
	 */
	
	public void updateUserName(Integer id) {
		Optional<User> byId = userRepos.findById(id);
		User user = byId.get();
		user.setName("POINTING");
		
	}
}
