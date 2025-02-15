package in.ahmed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ahmed.service.MessageService;

@RestController
public class MessageController {

	@Autowired
	private MessageService messageService;

	@GetMapping("/greet")
	public String getGreet() {
		return messageService.greetMessage();
	}
	@GetMapping("/msg")
	public ResponseEntity<String> getWelcome() {
		return messageService.WelcomeMsg();
	}

}
