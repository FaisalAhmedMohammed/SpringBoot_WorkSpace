package in.ahmed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ahmed.entity.User;
import in.ahmed.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	@Override
	public boolean saveUser(User user) {
		User savedUser = userRepo.save(user);
		/*
		 * saved user will contain primary key value based on that value we will check
		 * that record is inserted Db or not
		 */ return savedUser.getId() != null;
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();

	}

	@Override
	public boolean deleteByid(Integer id) {
		Optional<User> byId = userRepo.findById(id);
		// byId.ifPresent((byid)->userRepo.delete(byId.get()));
		if (byId.isPresent()) {
			User user = byId.get();
			userRepo.delete(user);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean edidById(User user) {

		if (user.getId() != null && userRepo.findById(user.getId()).isPresent()) {
			userRepo.save(user);
			return true;
		}

		return false;
	}

	@Override // this method is used to find the user object by id and return to edit page so
	public User findById(Integer id) {

		Optional<User> byId = userRepo.findById(id);
		if (byId.isPresent()) {

			return byId.get();
		}

		return new User();
	}

}
