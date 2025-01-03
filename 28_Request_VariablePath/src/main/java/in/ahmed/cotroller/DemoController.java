package in.ahmed.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@GetMapping("/welcome")
	@ResponseBody
	public String welcome(@RequestParam String name, @RequestParam Integer id) {

		return name + " ,Welcome to Hyderabad " + id;
	}

	@GetMapping("/greet/{name}/{id}")
	@ResponseBody
	public String greet(@PathVariable String name, @PathVariable Integer id) {
		return name + " , Hello Good Morining " + id;
	}

	@GetMapping("/demo/{id}")
	@ResponseBody
	public String demo(@RequestParam("name") String name ,@PathVariable Long id) {
		return name + " This is a new Method "+id ;
	}

}