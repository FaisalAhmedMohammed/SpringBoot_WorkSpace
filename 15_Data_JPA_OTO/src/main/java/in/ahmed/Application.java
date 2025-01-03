package in.ahmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ahmed.Service.PersonPassportService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		PersonPassportService bean = context.getBean(PersonPassportService.class);
		// bean.saveUser();
		// bean.deletePerson(1);

		// bean.deletePassport(1);
		// bean.deletePerson(1);

		bean.getPerson(2);
	}

}
