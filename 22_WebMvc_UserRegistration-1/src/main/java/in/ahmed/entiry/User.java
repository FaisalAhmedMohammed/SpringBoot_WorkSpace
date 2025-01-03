package in.ahmed.entiry;

import java.security.KeyStore.PrivateKeyEntry;
import java.time.LocalDate;

import org.apache.tomcat.util.security.PrivilegedGetTccl;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "User_Table")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String Email;
	private Long phno;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createDate;
	
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate lastUpdatedon;
	

}
