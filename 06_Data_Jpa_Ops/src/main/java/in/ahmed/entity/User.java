package in.ahmed.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//by default noargs constructor will come 
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_INFO") // it is optional
public class User {
	@Id
	private Integer id;
	private String Name;
	private String gender;
	private String country;

	@CreationTimestamp
	@Column(updatable = false)//created date value should not be updated
	private LocalDate createdAtDate;

	@UpdateTimestamp
	@Column(insertable  = false) //inserted date value should not be updated
	private LocalDate lastUpdatedDate;

}
