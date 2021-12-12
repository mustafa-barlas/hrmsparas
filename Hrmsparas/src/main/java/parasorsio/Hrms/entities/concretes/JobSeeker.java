package parasorsio.Hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "job_seekers")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_seeker_id")
	private int jobSeekerId;

	@Column(name = "job_seeker_name")
	private String jobSeekerName;

	@Column(name = "job_seeker_surname")
	private String jobSeekerSurname;

	@Column(name = "job_seeker_birth")
	private LocalDate jobSeekerBirth;

	@Column(name = "job_seeker_tc")
	private String jobSeekerTc;

	@Column(name = "job_seeker_phone_number")
	private String jobSeekerPhoneNumber;

	@ManyToOne()
	@JoinColumn(name = "cover_letter_id")
	private CoverLetter coverLetter;

	@ManyToOne()
	@JoinColumn(name = "education_information_id")
	private EducationInformation educationInformation;

	@ManyToOne()
	@JoinColumn(name = "foreign_language_id")
	private ForeignLanguage foreignLanguage;

	@ManyToOne()
	@JoinColumn(name = "skill_id")
	private Skill skill;

	@ManyToOne()
	@JoinColumn(name = "social_media_id")
	private SocialMedia socialMedia;

	@ManyToOne()
	@JoinColumn(name = "work_experience_id")
	private WorkExperience workExperience;

}
