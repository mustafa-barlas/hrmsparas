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

@Entity
@Data
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor
public class Employer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employer_ıd")
	private int employerId;
	
	@Column(name = "employer_phone_number")
	private String employerPhoneNumber;
	
	@Column(name = "employer_company_name")
	private String employerCompanyName;
	
	@Column(name = "employer_website")
	private String employerWebsite;
	
	
}
