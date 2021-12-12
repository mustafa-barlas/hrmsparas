package parasorsio.Hrms.business.abstracts;

import java.util.List;

import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	Result add(JobPosition jobPosition);

	Result update(JobPosition jobPosition);

	Result delete(int id);

	DataResult<JobPosition> getById(int id);

	DataResult<JobPosition> getByJobPositionName(String positionName);

	DataResult<List<JobPosition>> getAll(int pageNo, int pageSize);

	DataResult<List<JobPosition>> getAllSorted();

	DataResult<List<JobPosition>> getAll();

	DataResult<List<JobPosition>> getByJobPositionNameContains(String positionName);

	DataResult<List<JobPosition>> getByJobPositionNameStartsWith(String positionName);

}
