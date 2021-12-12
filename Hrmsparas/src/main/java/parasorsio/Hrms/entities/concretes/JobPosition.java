package parasorsio.Hrms.entities.concretes;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_positions")
@AllArgsConstructor
@NoArgsConstructor
public class JobPosition {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "position_id")
	private int positionId;
	
	@Column(name = "position_name")
	private String positionName;
	
	@Column(name = "position_description")
	private String positionDescription;
	
	
	@OneToMany(mappedBy="jobPosition")
	private List<JobAdvert>  jobAdverts;

	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;

}
