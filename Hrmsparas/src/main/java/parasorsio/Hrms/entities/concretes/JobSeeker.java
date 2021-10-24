package parasorsio.Hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;


@Entity
@Data
@Table(name ="job_seekers")
public class JobSeeker {

	
	@Id
	@GeneratedValue
	@Column (name ="job_seeker_id")
	private int jobSeekerId;
	
	@Column (name ="name")
	private String name;
	
	@Column (name ="surname")
	private String surname;
	
	@Column (name ="birth")
	private LocalDate birth;
	
	@Column(name = "tc")
    private String tc;
	
	@Column(name = "phone_number")
    private String phoneNumber;
	
	
}
