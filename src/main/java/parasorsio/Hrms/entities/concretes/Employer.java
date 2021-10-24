package parasorsio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "employers")
public class Employer {

	@Id
	@GeneratedValue
	@Column(name = "employer_ıd")
	private int employerId;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "website")
	private String website;
	
	
}
