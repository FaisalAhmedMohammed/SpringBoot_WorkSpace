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
		User save = userRepo.save(user);

		return save.getId() != null;
	}

	@Override
	public List<User> getAllusers() {
		return userRepo.findAll();
	}

	@Override
	public boolean deleteUser(Integer id) {//this method interact with the database to delete the user by id
		Optional<User> byId = userRepo.findById(id);
		if(byId.isPresent()) {
			userRepo.deleteById(id);
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean editByid(Integer id) {
		userRepo.findById(id);
		
		return false;
	}

}
