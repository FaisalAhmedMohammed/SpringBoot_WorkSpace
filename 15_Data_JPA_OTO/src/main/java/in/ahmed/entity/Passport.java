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
import lombok.ToString;

@Setter
@Getter
@Entity
@ToString
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passpordId;
	private String passpordNum;
	private LocalDate issuedAt;
	private LocalDate expireAt;

	/*
	 * Here establishing the relation between table using foreign key @joincolumn
	 * passport belongs to person
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "person_Id") // person id should be inserted as foreign key
	                              // in passport table
	
	
	private Person person;

}
