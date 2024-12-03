package in.ahmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ahmed.entity.Employee;
import in.ahmed.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeRepository emprope = context.getBean(EmployeeRepository.class);

		System.out.println(" EmployeeRepository impl calss:"+emprope.getClass().getName());

		Employee emp = new Employee();

		emp.setEmpId(103);
		emp.setEmpName("faisal mohammed");
		emp.setEmpSalary(3000.0);
		
		emprope.save(emp);

	}

}
