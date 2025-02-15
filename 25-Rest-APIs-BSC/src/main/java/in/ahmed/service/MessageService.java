package in.ahmed.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

	public String greetMessage() {
		String msg = "Hello Good Morning";
		return msg;
	}

	public ResponseEntity<String> WelcomeMsg() {
		String msg = "Welcome To Rest APIs ";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

}
