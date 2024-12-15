package in.ahmed.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ahmed.entity.Roles;
import in.ahmed.entity.User;
import in.ahmed.repo.RolesRepo;
import in.ahmed.repo.UserRepo;

@Service
public class UserRolesService {

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private RolesRepo rolesRepo;

	public void getUser() {
		Optional<User> byId = userRepo.findById(1);
		if (byId.isPresent()) {
			System.out.println(byId.get());
		}

	}

	public void deleteUser() {
		userRepo.deleteById(1);

	}

	public void saveUser() {
		Roles roles = new Roles();
		roles.setRoleName("Accountant");

		Roles roles2 = new Roles();
		roles2.setRoleName("Manager");
		List<Roles> asList = Arrays.asList(roles, roles2);
		// rolesRepo.saveAll(asList);

		User user = new User();
		user.setUsername("ashok");
		user.setGender("male");

		user.setRoles(asList);
		userRepo.save(user);
	}
}
