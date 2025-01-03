package in.ahmed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ahmed.Iservice.UserService;
import in.ahmed.entiry.User;
import in.ahmed.repo.UserRepo;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	@Override
	public boolean saveUser(User user) {
		User savedUser = userRepo.save(user);

		return savedUser.getId() != null;
	}

	@Override
	public List<User> getAllUsers() {

		return userRepo.findAll();
	}

}
