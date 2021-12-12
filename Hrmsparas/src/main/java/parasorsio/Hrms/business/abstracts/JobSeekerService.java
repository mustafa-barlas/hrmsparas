package parasorsio.Hrms.business.abstracts;

import java.util.List;

import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {

	Result add(JobSeeker jobSeeker);

	Result update(JobSeeker jobSeeker);

	Result delete(int id);

	DataResult<JobSeeker> getById(int id);

	DataResult<List<JobSeeker>> getByJobSeekerNameAndJobSeekerSurname(String jobSeekerName, String jobSeekerSurname);

	DataResult<List<JobSeeker>> getAll();

	DataResult<List<JobSeeker>> getAll(int pageNo, int pageSize);

	DataResult<List<JobSeeker>> getAllSorted();

	DataResult<List<JobSeeker>> getByJobSeekerNameContains(String jobSeekerName);

	DataResult<List<JobSeeker>> getByJobSeekerNameStartsWith(String jobSeekerName);

}
