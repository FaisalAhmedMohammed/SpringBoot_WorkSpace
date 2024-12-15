package in.ahmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ahmed.sercvice.EmployeeAddressService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeAddressService bean = context.getBean(EmployeeAddressService.class);
		 bean.saveUser();
		// bean.getEmp();
		// bean.deleteByid();
		//bean.getAdd();
	}

}
