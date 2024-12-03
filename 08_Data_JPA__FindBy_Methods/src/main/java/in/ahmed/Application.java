package in.ahmed;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ahmed.entity.Customer;
import in.ahmed.service.CustomerService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		CustomerService bean = context.getBean(CustomerService.class);
		// bean.saveUser();

		bean.getName("RAMESH");// The name parameter is passed //Goal: Fetch and display all Customer entities
								// whose name matches the input.

		Optional<Customer> coustomer = bean.findCoustomer("sdf", "ALLEN@123");
		if (coustomer.isPresent()) {
			System.out.println(coustomer.get());

		} else {
			System.out.println("NO Records found");
		}
	}

}
