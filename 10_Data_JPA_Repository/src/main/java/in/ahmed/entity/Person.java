package in.ahmed.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
	@Id
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private String country;

	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createdOnDate;

	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate lastupdatedDate;

}
