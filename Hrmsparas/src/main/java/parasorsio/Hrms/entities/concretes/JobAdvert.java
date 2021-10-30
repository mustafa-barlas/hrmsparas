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

@Data
@Entity
@Table(name = "jobadverts")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvert {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_advert_id")
	private int jobAdvertId;

	@Column(name = "job_advert_description")
	private String jobAdvertDescription;

	@Column(name = "job_advert_publish_date")
	private LocalDate jobAdvertPublishDate;

	@Column(name = "job_advert_deadline")
	private LocalDate jobAdvertDeadline;

	@Column(name = "job_advert_number_of_application")
	private String jobAdvertNumberOfApplication;

	@Column(name = "job_advert_viewing")
	private String jobAdvertViewing;

	@Column(name = "job_advert_advertiser_company")
	private String jobAdvertAdvertiserCompany;

}
