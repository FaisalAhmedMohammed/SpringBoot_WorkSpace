package in.ahmed.repo;

import org.springframework.data.repository.CrudRepository;

import in.ahmed.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
