package parasorsio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "job_positions")
public class JobPosition {

	
	@Id
	@GeneratedValue
	@Column(name = "position_id")
	private int positionId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
}
