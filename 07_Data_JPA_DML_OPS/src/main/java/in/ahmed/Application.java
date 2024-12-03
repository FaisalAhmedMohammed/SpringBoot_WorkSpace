package in.ahmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ahmed.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context 
		= SpringApplication.run(Application.class, args);
		ProductService bean = context.getBean(ProductService.class);
		
		//bean.insertUsers();
		
		//bean.updateUser(202);
		
		bean.deleteUser();
	}

}
