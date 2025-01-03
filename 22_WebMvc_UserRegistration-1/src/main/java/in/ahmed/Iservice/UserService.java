package in.ahmed.Iservice;

import java.util.List;

import in.ahmed.entiry.User;

public interface UserService {

	public boolean saveUser(User user);
	
	public List<User> getAllUsers();
}
