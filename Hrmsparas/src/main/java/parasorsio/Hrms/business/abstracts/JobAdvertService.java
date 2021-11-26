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
	
	DataResult<List<JobAdvert>> getAll();
	
	DataResult<List<JobAdvert>> getAll(int pageNo,int pageSize);
	
	DataResult<List<JobAdvert>> getAllSorted();
	
	DataResult<JobAdvert> getByJobAdvertName(String jobAdvertName);

	DataResult<JobAdvert> getByJobAdvertNameOrCategoryId(String jobAdvertName, int categoryId);

	DataResult<List<JobAdvert>> getByCategoryIdIn(List<Integer> categories);

	DataResult<List<JobAdvert>> getByJobPositionIdIn(List<Integer> positions);

	DataResult<List<JobAdvert>> getByJobAdvertNameContains(String jobAdvertName);

	DataResult<List<JobAdvert>> getByJobAdvertNameStartsWith(String jobAdvertName);

	DataResult<List<JobAdvert>> getByJobAdvertAdvertiserCompany(String jobAdvertAdvertiserCompany);

	
}
