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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "education_informations")
public class EducationInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "education_id")
	private int educationId;

	@Column(name = "school_information")
	private String schoolInformation;

	@Column(name = "school_start")
	private int schoolStart;

	@Column(name = "graduation_time")
	private int graduationTime;

	@OneToMany(mappedBy = "educationInformation")
	private List<JobSeeker> jobSeekers;
}
