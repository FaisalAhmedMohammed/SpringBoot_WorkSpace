package in.ahmed.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	@GetMapping(value="/greet"
			, produces = "text/plain") // if we map to http protocol method then only it is a distributed method
	public String greetMsg() {
		String msg = "Good Morning";
		return msg;
	}

	// how to decide the status code for my rest api
	// what response should go what status code should go
	// here we are constructing response packet
	@GetMapping(value = "/welcome",
			produces = "text/plain")
	public ResponseEntity<String> Welcome() {// there is a class ResponseEntity then what response u went to
												// send<String>
		String msg = "Welcome To Rest APIs !!";
		return new ResponseEntity<String>(msg, HttpStatus.OK); // here we are creating object for response entity it is returning msg nothing but response body payload
																// and status code
	}

}
