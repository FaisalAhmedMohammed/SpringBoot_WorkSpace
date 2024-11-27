package in.ahmed.repo;

import org.springframework.data.repository.CrudRepository;

import in.ahmed.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	/*
	 * //curd repository is a predefined repository in data jpa what ever the
	 * methods available in the curd repository we can access in emp reprository
	 * 
	 * super class methods we can access in sub class
	 * 
	 * Data JPA will provide the implementation class for Employee Repository
	 */
}
