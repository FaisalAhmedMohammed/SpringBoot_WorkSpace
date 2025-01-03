package in.ahmed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@GetMapping("/demo")
	@ResponseBody
	public String demo() {
		return "this is demo page";
	}

	@ResponseBody
	public String Demo(@RequestParam("name") String name, @RequestParam("phno") Long phno) {

		return name + " , This is your name, your phno is : " + phno;
	}

	@GetMapping("/product")
	@ResponseBody
	public String Product(@RequestParam("name") String name) {
		return name + " serching for the product ";
	}

	@GetMapping("/greet/{name}")
	@ResponseBody
	public String Greet(@PathVariable("name") String name, @RequestParam("id")Long id) {
		return name + ", This is greet Message" +id;
	}
}
