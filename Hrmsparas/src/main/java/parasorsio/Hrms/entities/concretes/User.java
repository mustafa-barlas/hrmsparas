package parasorsio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

	
	@Id
	@GeneratedValue
	@Column(name = "password")
	private String password;
    
	@Column(name = "amail")
	private String email;
	
	@Column(name = "validation")
	private boolean validation;
}
