package in.ahmed.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ahmed.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
