package in.ahmed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prod")
public class ProductController {
	@GetMapping("/newgreet")
	public String getGreeting(Model model) {
 
		model.addAttribute("msg", "This is new mobile Phone");

		return "index";
		/*
		 * String return  type represent it is a view page model object which we are taking as
		 * a method parameter will be mapped with this view what ever the data we set in
		 * the model we can access in the view page
		 */
	}

}
