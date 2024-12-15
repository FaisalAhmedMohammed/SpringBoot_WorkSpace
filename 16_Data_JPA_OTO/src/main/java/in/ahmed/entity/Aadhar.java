package in.ahmed.entity;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Aadhar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aadharId;
	private String aadherNum;
	private LocalDate issueDate;
	private LocalDate expiDate;
	
	@OneToOne
	@JoinColumn(name = "peson_Id")
	private Person person;

}
