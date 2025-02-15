package in.ahmed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ahmed.bindings.Customer;
import in.ahmed.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/convertToJson")
    public String convertToJson(Model model) {
        try {
            customerService.convertJavaToJson();
            model.addAttribute("message", "Java object successfully converted to JSON and saved.");
        } catch (Exception e) {
            model.addAttribute("message", "Error converting to JSON: " + e.getMessage());
        }
        return "index";
    }
	@GetMapping("/convertToJava")
    public String convertToJava(Model model) {
        try {
            Customer customer = customerService.convertJsonToJava();
            model.addAttribute("customer", customer);
        } catch (Exception e) {
            model.addAttribute("message", "Error converting to Java: " + e.getMessage());
        }
        return "index";
    }
}

