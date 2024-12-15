package in.ahmed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	@GetMapping("/greet")
	public ModelAndView greet() {
		ModelAndView mdv = new ModelAndView();
		mdv.addObject("msg", "Hello Hi Good Morning");
		mdv.setViewName("index");
		return mdv;

	}

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {

		ModelAndView mdView = new ModelAndView();

		mdView.addObject("msg", "welcome to ashokit Institute");
		mdView.setViewName("index");

		return mdView;

	}

}
