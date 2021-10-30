package parasorsio.Hrms.business.abstracts;

import java.util.List;

import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	
	DataResult<List<JobPosition>> getAll();
	
	
	Result add(JobPosition jonPosition);
	Result update(JobPosition jonPosition);
	Result delete(JobPosition jonPosition);
	
}
