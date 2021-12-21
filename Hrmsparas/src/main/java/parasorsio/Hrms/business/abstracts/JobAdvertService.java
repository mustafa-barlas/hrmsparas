package parasorsio.Hrms.business.abstracts;

import java.time.LocalDate;
import java.util.List;

import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.JobAdvert;
import parasorsio.Hrms.entities.dtos.JobAdvertWithJobPositionDto;

public interface JobAdvertService {

	Result add(JobAdvert jobAdvert);

	Result update(JobAdvert jobAdvert);

	Result delete(int id);

	DataResult<JobAdvert> getById(int id);

	DataResult<JobAdvert> getByJobAdvertName(String jobAdvertName);

	DataResult<JobAdvert> getByOpenPosition(int jobAdvertOpenPosition);

	DataResult<JobAdvert> getByAdvertDeadline(LocalDate jobAdvertDeadline);

	DataResult<JobAdvert> getByMaxSalary(int jobAdvertMaxSalary);

	DataResult<JobAdvert> getByMinSalary(int jobAdvertMinSalary);

	DataResult<List<JobAdvert>> getAll();

	DataResult<List<JobAdvert>> getAll(int pageNo, int pageSize);

	DataResult<List<JobAdvert>> getAllSorted();

	DataResult<List<JobAdvert>> getByPosition(String jobPosition);

	DataResult<List<JobAdvert>> getByCity(String city);

	DataResult<List<JobAdvert>> getByJobAdvertNameContains(String jobAdvertName);

	DataResult<List<JobAdvert>> getByJobAdvertNameStartsWith(String jobAdvertName);

	DataResult<List<JobAdvert>> getByJobAdvertAdvertiserCompany(String jobAdvertAdvertiserCompany);

	DataResult<List<JobAdvert>> getByNameAndId(String jobAdvertName, int jobAdvertId);
	
	DataResult<List<JobAdvertWithJobPositionDto>> getJobAdvertDetails();

}
