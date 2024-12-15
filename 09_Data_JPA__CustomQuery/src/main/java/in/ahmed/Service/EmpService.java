package in.ahmed.Service;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import in.ahmed.entity.Employee;
import in.ahmed.repo.EmployeeRepository;

@Service
public class EmpService {

	private EmployeeRepository employeeRepository;

	public EmpService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public void saveUser() {

		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("ALLEN");
		employee.setSalary(2000.0);
		employee.setCountry("USA");

		Employee employee2 = new Employee();
		employee2.setId(102);
		employee2.setName("SMITH");
		employee2.setSalary(3000.0);
		employee2.setCountry("USA");

		Employee employee3 = new Employee();
		employee3.setId(103);
		employee3.setName("SCOTT");
		employee3.setSalary(4000.0);
		employee3.setCountry("CANADA");

		Employee employee4 = new Employee();
		employee4.setId(104);
		employee4.setName("JOHN");
		employee4.setSalary(6000.0);
		employee4.setCountry("CANADA");

		List<Employee> asList = Arrays.asList(employee, employee2, employee3, employee4);
		employeeRepository.saveAll(asList);

	}

	public void getAllUsers() {
		List<Employee> allUsers = employeeRepository.getAllUsers();
		for (Employee employee : allUsers) {
			System.out.println(employee);
		}
	}
	/*
	 * public void getUserByCountry(String country) { List<Employee> usaEmp =
	 * employeeRepository.getUsaEmp(country); for (Employee employee : usaEmp) {
	 * System.out.println(employee); } }
	 */

	public void getNameAndCountry(String name, String country) {
		List<Employee> byNameAndCountry = employeeRepository.getByNameAndCountry(name, country);
		byNameAndCountry.forEach(e -> {
			System.out.println(e);
		});
	}

	/*
	 * public void getSql() { List<Employee> byNativeSql =
	 * employeeRepository.getByNativeSql(); byNativeSql.forEach(e -> {
	 * System.out.println(e); });
	 * 
	 * }
	 */
	/*
	 * public void getHqlUsers(Integer id, String name, Double sal, String country)
	 * { Employee e = new Employee(); e.setId(id); e.setName(name);
	 * e.setSalary(sal); e.setCountry(country);
	 * 
	 * employeeRepository.saveUserHql(id, name, sal, country);
	 * System.out.println("saved...."); }
	 */

	public void getHql() {

		Employee employee = new Employee();
		employee.setId(56);
		employee.setName("avdd");
		employee.setSalary(97654.0);
		employee.setCountry("UK");

		Employee employee2 = new Employee();
		employee2.setId(7);
		employee2.setName("dsdf");
		employee2.setSalary(9765.9);
		employee2.setCountry("USA");

		Employee employee3 = new Employee();
		employee3.setId(8);
		employee3.setName("dfgft");
		employee3.setSalary(7000.8);
		employee3.setCountry("UK");

		List<Employee> asList = Arrays.asList(employee, employee2, employee3);
		// employeeRepository.saveUserHql(asList);

	}
}
