package in.ahmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ahmed.Service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmpService empService = context.getBean(EmpService.class);
		// empService.saveUser();

		// empService.getAllUsers();

		// empService.getUserByCountry("USA");
		// empService.getNameAndCountry("SCOTT", "CANADA");

		//empService.getSql();
		
		//empService.getHqlUsers(133, "Allen", 464.0, "India");
		//empService.getHql(222,"AFNAN",2000.0,"INDIA");
		empService.getHql();
		
		
		
	}

}
