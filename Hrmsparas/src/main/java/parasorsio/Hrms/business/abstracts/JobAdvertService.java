package parasorsio.Hrms.business.abstracts;

import java.util.List;

import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.entities.concretes.JobAdvert;

public interface JobAdvertService {

	Result add(JobAdvert jobAdvert);

	Result update(JobAdvert jobAdvert);

	Result delete(int id);

	DataResult<JobAdvert> getById(int id);

	DataResult<JobAdvert> getByJobAdvertName(String jobAdvertName);

	DataResult<List<JobAdvert>> getAll();

	DataResult<List<JobAdvert>> getAll(int pageNo, int pageSize);

	DataResult<List<JobAdvert>> getAllSorted();

	DataResult<List<JobAdvert>> getByJobAdvertNameContains(String jobAdvertName);

	DataResult<List<JobAdvert>> getByJobAdvertNameStartsWith(String jobAdvertName);

	DataResult<List<JobAdvert>> getByJobAdvertAdvertiserCompany(String jobAdvertAdvertiserCompany);

}
