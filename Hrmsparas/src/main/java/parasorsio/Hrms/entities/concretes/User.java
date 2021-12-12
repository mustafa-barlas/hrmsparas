package parasorsio.Hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "users")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User  {

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "user_email")
	private String userEmail;
	
	@Column(name = "user_password")
	private String userPassword;
	
	@Column(name = "user_status")
	private boolean userStatus;
	
	@Column(name = "user_validation")
	private boolean userValidation;
	
	
}
