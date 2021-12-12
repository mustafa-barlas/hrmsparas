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

@Data
@Entity
@Table(name = "job_adverts")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvert {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_advert_id")
	private int jobAdvertId;

	@Column(name = "job_advert_name")
	private String jobAdvertName;

	@Column(name = "job_advert_description")
	private String jobAdvertDescription;

	@Column(name = "job_advert_city")
	private String jobAdvertCity;

	@Column(name = "job_advert_publish_date")
	private LocalDate jobAdvertPublishDate;

	@Column(name = "job_advert_deadline")
	private LocalDate jobAdvertDeadline;

	@Column(name = "job_advert_number_of_application")
	private String jobAdvertNumberOfApplication;

	@Column(name = "job_advert_max_salary")
	private String jobAdvertMaxSalary;

	@Column(name = "job_advert_min_salary")
	private String jobAdvertMinSalary;

	@Column(name = "job_advert_open_position")
	private String jobAdvertOpenPosition;

	@Column(name = "job_advert_viewing")
	private String jobAdvertViewing;

	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;

	@ManyToOne()
	@JoinColumn(name = "position_id")
	private JobPosition jobPosition;

	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City city;

}
