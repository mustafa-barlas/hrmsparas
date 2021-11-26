package parasorsio.Hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	@Column(name = "employer_id")
	private int employerId;
	
	@Column(name = "employer_phone_number")
	private String employerPhoneNumber;
	
	@Column(name = "employer_name")
	private String employerName;
	
	@Column(name = "employer_website")
	private String employerWebsite;
	
	@Column(name ="employer_postings")
	private String employerPosings;
	
	@Column(name ="employer_position")
	private String employerPosition;
	
	@Column(name ="employer_explanation")
	private String employerExplanation;
	
	
	@OneToMany(mappedBy ="employer")
	private List<JobAdvert> jobAdverts;
	
	@OneToMany(mappedBy ="employer")
	private List<JobPosition> jobPosition;
	
	@OneToMany(mappedBy ="employer")
	private List<User> user;
	
}
