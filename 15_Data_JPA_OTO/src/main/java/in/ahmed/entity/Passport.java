package in.ahmed.entity;

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
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passpordId;
	private String passpordNum;
	private LocalDate issuedAt;
	private LocalDate expireAt;
	
	@OneToOne
	@JoinColumn(name = "person_Id")
	private Person person;
	
	
}
