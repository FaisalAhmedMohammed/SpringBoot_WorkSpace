package in.ahmed.sercvice;

import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ahmed.entity.Address;
import in.ahmed.entity.Employee;
import in.ahmed.repo.AddressRepo;
import in.ahmed.repo.EmployeeRepo;

@Service
public class EmployeeAddressService {
	@Autowired
	private EmployeeRepo employeeRepo;
	@Autowired
	private AddressRepo addressRepo;

	public void getAdd() {
		addressRepo.findById(1);
	}

	public void deleteByid() {
		employeeRepo.deleteById(1);
	}

	public void getEmp() {
		Optional<Employee> byId = employeeRepo.findById(1);
		if (byId.isPresent()) {
			Employee employee = byId.get();
			System.out.println(employee);
		}
	}

	public void saveUser() {
		Employee employee = new Employee();
		employee.setEmpName("ashok");
		employee.setSalary(5000.0);

		Address address = new Address();
		address.setCity("bangalore");
		address.setState("katnataka");
		address.setType("present");
		address.setEmployee(employee);

		Address address2 = new Address();

		address2.setCity("Hyd");
		address2.setState("Telengana");
		address2.setType("Permanent");
		address2.setEmployee(employee);

		List<Address> asList = Arrays.asList(address, address2);

		employee.setAddressList(asList);

		employeeRepo.save(employee);

	}

}
