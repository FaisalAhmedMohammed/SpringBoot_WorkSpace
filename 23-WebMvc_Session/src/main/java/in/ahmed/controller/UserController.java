package in.ahmed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.ahmed.entity.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	@GetMapping("/")
	public String LoadForm(HttpServletRequest req, Model model) {

		User userObj = new User();
		model.addAttribute("user", userObj);

		return "index";

	}

	@PostMapping("/login")
	public String login(HttpServletRequest req, User user, Model model) {

		String email = user.getEmail();
		String password = user.getPassword();
		if (email.equals("faisal@123") && password.equals("123")) {

			HttpSession session = req.getSession(true);
			session.setAttribute("email", email);
			return "dashboard";
		} else {
			model.addAttribute("emsg", "invalid Crediantials");
		}
		return "index";

	}

	@GetMapping("/personal-details")
	@ResponseBody
	public String getPersonalDetails(HttpServletRequest req, Model model) {

		HttpSession session = req.getSession(false);
		String email = (String) session.getAttribute("email");

		return "getting personal datails of :" + email;
	}

	@GetMapping("/edu-details")
	@ResponseBody
	public String eductionDetails(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession(false);
		Object email = session.getAttribute("email");
		return "Getting Education Details of :" + email;
	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest req, Model model) {

		User userObj = new User();
		model.addAttribute("user", userObj);

		HttpSession session = req.getSession(false);
		session.invalidate();

		return "index";

	}

}
