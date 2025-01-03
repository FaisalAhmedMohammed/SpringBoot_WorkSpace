package in.ahmed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import in.ahmed.entity.User;
import in.ahmed.repo.UserRepo;
import in.ahmed.service.UserService;
import in.ahmed.service.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@GetMapping("/")
	public String loadForm(Model model) {/* this method is used to open user form */
		// logic to load the form

		User userObj = new User(); /*
									 * when u access the method i am sending empty user object to UI index page i am
									 * sending empty object why because to map form fields
									 */
		model.addAttribute("user", userObj);
		return "index";

	}

	@PostMapping("/user") /*
							 * here we are taking post mapping because we are submitting the form it has
							 * confidential details
							 */
	public String formSubmit(User user, Model model) {
		/*
		 * // this method to save the user ,here we are taking User user object as a
		 * parameter bcoz when the form is submitted i don't want to catch the form
		 * data, dispatcher servlet will catch data and store it into user object, that
		 * user object i am passing to my service method that service method is passing
		 * that user object to repo.save()method and record is inserted inDb
		 */
		boolean userStatus = userServiceImpl.saveUser(user);
		if (userStatus) {
			model.addAttribute("smsg", "user saved in DataBase ");
		} else {
			model.addAttribute("emsg", "Error massege");

		}
		return "index";

	}

	@GetMapping("/users")
	public String getUsers(Model model) {// this method to get the users
		// logic to fetch the users

		List<User> allUsers = userServiceImpl.getAllUsers();
		model.addAttribute("users", allUsers);
		return "users";
	}

	@GetMapping("/remove/{id}")
	public String deleteUserByid(@PathVariable("id") Integer id, Model model) {// this method to get the users
		// logic to fetch the users

		boolean status = userServiceImpl.deleteByid(id);

		if (status) {
			model.addAttribute("msgSus", "Deletion success of '" + id + "'");
		} else {
			model.addAttribute("msgErr", "Deletion failed");
		}

		return "Msg";

	}

	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable("id") Integer id, Model model) {/* this method is used to open user form */
		// logic to load the form
		User userObj = userServiceImpl.findById(id);
		
		model.addAttribute("user", userObj);
		return "edit";

	}

	@PostMapping("/edit")
	public String EditUser(User user, Model model) {
		boolean status = userServiceImpl.edidById(user);
		if (status) {
			model.addAttribute("msgSus", "Updated! '" + user.getId() + "' ");
		} else {
			model.addAttribute("msgErr", "Failed! '" + user.getId() + "' ");
		}
		return "Msg";
	}

}
