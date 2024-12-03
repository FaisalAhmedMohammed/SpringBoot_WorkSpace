package in.ahmed.Service;

import org.springframework.stereotype.Service;

import in.ahmed.repo.EmployeeRepository;
@Service
public class EmpService {
	
	private EmployeeRepository employeeRepository;

	public EmpService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	

}
