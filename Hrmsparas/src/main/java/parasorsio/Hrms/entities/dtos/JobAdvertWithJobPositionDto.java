package parasorsio.Hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertWithJobPositionDto  {
	
	
	private int jobAdvertId;
	
	private String jobAdvertName;
	
	private String jobPositionName;

}
