package parasorsio.Hrms.business.abstracts;

import java.util.List;

import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.entities.concretes.JobSeeker;

public interface jobSeekerService {
	
	
	
    Result add(JobSeeker jobSeeker);
	
	Result update(JobSeeker jobSeeker);
	
	Result delete(int id);
	
	DataResult<JobSeeker> getById(int id);
	
	DataResult<List<JobSeeker>> getAll();
	
	DataResult<JobSeeker> getAll(int pageNo,int pageSize);
	
	DataResult<JobSeeker> getByJobSeekerNameAndJobSeekerSurname(String jobSeekerName, String jobSeekerSurname);

	DataResult<JobSeeker> getByJobSeekerTc(String jobSeekerTc);

	DataResult<JobSeeker> getByJobSeekerId(int jobSeekerId);

	DataResult<List<JobSeeker>> getByJobSeekerNameContains(String jobSeekerName);

	DataResult<List<JobSeeker>> getByJobSeekerNameStartsWith(String jobSeekerName);

	
}
