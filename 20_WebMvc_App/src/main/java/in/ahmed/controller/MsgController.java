package in.ahmed.controller;

/* here two methods are returning same key with same view name  but values are different.
 * this project is called as multi action controller means one controller can handel multiple request here 
 * /greet is one request and /welcome is another request
 * 
 *  every method should have unique url pattern otherwise we will get ambiguity problem*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/view")
public class MsgController {
	
	@GetMapping("/greet")
	public ModelAndView greet() {// when this method should execute when u send a request through /greet this
									// method should execute
		ModelAndView mdv = new ModelAndView();
		mdv.addObject("msg", "Hello Hi Good Morning");// what data u want to send to servlet (or)add the data in the form of key and value
		mdv.setViewName("index");// this is the logical view name that is used to map to the file. In which page
									// this data should be displayed we are setting
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
