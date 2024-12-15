package in.ahmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ahmed.service.UserRolesService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRolesService bean = context.getBean(UserRolesService.class);
		//bean.saveUser();
		//bean.getUser();
		bean.deleteUser();
	}

}
