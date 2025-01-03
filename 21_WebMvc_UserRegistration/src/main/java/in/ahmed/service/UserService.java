package in.ahmed.service;

import java.util.List;

import in.ahmed.entity.User;

public interface UserService {

	// this method is used to save user
	public boolean saveUser(User user); /*
										 * here we are taking boolean as a return type and object as a parameter because
										 * which user data we want to save coming from the UI that data we will represent as
										 * object that why iam taking object as a parameter --> after saving the recored
										 * whether recored is inserted or not inserted i will decide by using true or
										 * false
										 */
	
	//this method is used to retrive  all user from the data base
	public List<User> getAllUsers();
	
	
	public boolean edidById(User user);
	
	public boolean deleteByid(Integer id);
	
	public User findById(Integer id);//when the user click on edit i

}
