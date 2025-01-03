package in.ahmed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ahmed.Iservice.UserService;
import in.ahmed.entiry.User;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String LoadForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);

		return "index";
	}

	@PostMapping("/user")
	public String formSubmit(User user, Model model) {

		boolean savedUser = userService.saveUser(user);
		if (savedUser) {
			model.addAttribute("smsg", "user saved");

		} else {
			model.addAttribute("emsg", "error message");

		}

		return "index";
	}

	@GetMapping("/users")
	public String getUsers(Model model) {
		List<User> allUsers = userService.getAllUsers();
		model.addAttribute("users", allUsers);
		return "users";
	}

}
