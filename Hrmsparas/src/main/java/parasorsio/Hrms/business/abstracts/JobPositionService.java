package parasorsio.Hrms.business.abstracts;

import java.util.List;

import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	
	
	Result add(JobPosition jonPosition);
	
	Result update(JobPosition jonPosition);
	
	Result delete(int id);
	
	DataResult<JobPosition> getById(int id);
	
	DataResult<List<JobPosition>> getAll();
	
	DataResult<JobPosition> getAll(int pageNo,int pageSize);
	
	DataResult<JobPosition> getBySorted();
	
	DataResult<JobPosition> getByJobPositionName(String positionName);
	
	DataResult<JobPosition> getByJobPositionId(int positionId);
	
	DataResult<List<JobPosition>> getByJobPositionIdAndName(int positionId,String positionName);
	
	DataResult<List<JobPosition>> getByJobPositionNameContains(String positionName);

	DataResult<List<JobPosition>> getByJobPositionNameStartsWith(String positionName);
	
	

	
	
	
}
