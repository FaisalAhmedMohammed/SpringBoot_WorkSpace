package in.ahmed.service;

import java.util.List;

import com.fasterxml.jackson.annotation.OptBoolean;

import in.ahmed.entity.User;

public interface UserService {

	public boolean saveUser(User user);

	public List<User> getAllusers();
	
	public boolean deleteUser(Integer id);
	
	public boolean editByid(Integer id);
	

}
