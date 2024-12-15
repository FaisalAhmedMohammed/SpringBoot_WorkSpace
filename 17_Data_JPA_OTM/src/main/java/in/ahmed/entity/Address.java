package in.ahmed.entity;

import java.util.jar.Attributes.Name;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addrId;
	private String city;
	private String state;
	private String type;
	
	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Employee employee;/* this is nothing but relation ship
	                               here we are mapping address with employee */

}
