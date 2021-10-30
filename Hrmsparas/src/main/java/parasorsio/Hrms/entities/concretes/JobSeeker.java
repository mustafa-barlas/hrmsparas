package parasorsio.Hrms.entities.concretes;

import java.time.LocalDate;

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
@Table(name ="job_seekers")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name ="job_seeker_id")
	private int jobSeekerId;
	
	@Column (name ="job_seeker_name")
	private String jobSeekerName;
	
	@Column (name ="job_seeker_surname")
	private String jobSeekerSurname;
	
	@Column (name ="job_seeker_birth")
	private LocalDate jobSeekerBirth;
	
	@Column(name = "job_seeker_tc")
    private String jobSeekerTc;
	
	@Column(name = "job_seeker_phone_number")
    private String jobSeekerPhoneNumber;
	
	
}
