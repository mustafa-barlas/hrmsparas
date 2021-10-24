package parasorsio.Hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "jobadverts")
public class JobAdvert {

	@Id
	@GeneratedValue
	@Column( name = "job_advert_id")
	private int jobAdvertId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "publish_date")
	private LocalDate publishDate;
	
	@Column(name = "deadline")
	private LocalDate deadline;
	
	@Column(name = "number_of_application")
	private String numberOfApplication;
	
	@Column(name = "viewing")
	private String viewing;
	
	@Column(name = "advertiser_company")
	private String advertiserCompany;
	
	
	
}
