package in.ahmed.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
	@Id // it is used to represent this variable is mapped with primary key column
	private Integer empId;
	private String empName;
	private Double empSalary;

}
