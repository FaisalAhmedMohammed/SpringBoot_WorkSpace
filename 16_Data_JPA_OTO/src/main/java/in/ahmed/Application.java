package in.ahmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ahmed.service.PersonAadharService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		PersonAadharService bean = context.getBean(PersonAadharService.class);
		//bean.saveUser();
		//bean.getPerson();
		
		//left Join
		//bean.getAadhar();
		
		bean.deletePerson();
		
		bean.delteAadhar();
	}

}
