package in.ahmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ahmed.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		UserService userService = ctxt.getBean(UserService.class);
		//userService.deleteAll();
		//userService.saveUser();
		//userService.saveUsers();
		
		//userService.getAllUsers();
		//userService.getUserById(102);
		
		//userService.getUserByCountry("INDIA");
		
		//userService.getUserByCountryAndGender("INDIA", "FEMALE");
		
		//userService.getUSerBySalaryGreaterThanEquals(1000.0);
		
		//userService.getAllUsersHQ();  
		
		//userService.getUserByIdHQL(103);
		
		userService.updateUserName(101);
		
	
	}

}
