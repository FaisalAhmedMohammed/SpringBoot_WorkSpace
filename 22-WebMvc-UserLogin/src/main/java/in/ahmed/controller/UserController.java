package in.ahmed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import in.ahmed.entity.User;
import in.ahmed.service.UserServiceImpl;

@Controller
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;

	@GetMapping("/")
	public String LoadForm(Model model) {

		User userObj = new User();
		model.addAttribute("user", userObj);
		return "index";
	}

	@PostMapping("/user")
	public String formSubmit(User user, Model model) {
		boolean userStatus = userServiceImpl.saveUser(user);
		if (userStatus) {
			model.addAttribute("smsg", "user saved in DataBase ");
		} else {
			model.addAttribute("emsg", "Error massege");

		}
		return "index";

	}

	@GetMapping("/users")
	public String getAllUsers(Model model) {
		List<User> allusers = userServiceImpl.getAllusers();
		model.addAttribute("users", allusers);

		return "users";
	}

	@GetMapping("/remove/{id}")
	public String deleteById(@PathVariable("id") Integer id, Model model) {
		boolean  status=userServiceImpl.deleteUser(id);
		
		if(status) {
			model.addAttribute("smsg", "User Deleted"+id);
		}
		else {
			model.addAttribute("emsg","Error message" );
		}

		return "users";

	}

}



/* Flow of the Delete Method
User Action:

The user clicks the Delete link for a specific user in the table.
URL Construction:

The th:href attribute generates a URL like /remove/1 (where 1 is the user's ID).
Controller Invocation:

The request is handled by the deleteById method of UserController.
The method extracts the id from the URL using @PathVariable.
Service Layer:

The controller calls userServiceImpl.deleteUser(id) to perform the delete operation.
Service Method Execution:

The deleteUser method in UserServiceImpl interacts with the database to delete the user by ID.
Returns true if successful, false otherwise.
Response Preparation:

Based on the return value:
If true: Adds a success message (User Deleted {id}) to the model.
If false: Adds an error message (Error message) to the model.
Return View:

The method returns the users view (HTML page).
When the page is reloaded, the updated list of users is fetched and displayed.
*/
