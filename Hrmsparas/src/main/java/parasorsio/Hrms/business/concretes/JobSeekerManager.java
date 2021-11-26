package parasorsio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import parasorsio.Hrms.business.abstracts.jobSeekerService;
import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.core.utilities.Result.SuccessDataResult;
import parasorsio.Hrms.core.utilities.Result.SuccessResult;
import parasorsio.Hrms.dataAccess.abstracts.JobSeekerDao;
import parasorsio.Hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements jobSeekerService {

	private JobSeekerDao jobSeekerDao;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;

	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<JobSeeker> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<JobSeeker> getAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<JobSeeker> getByJobSeekerNameAndJobSeekerSurname(String jobSeekerName, String jobSeekerSurname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<JobSeeker> getByJobSeekerTc(String jobSeekerTc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<JobSeeker> getByJobSeekerId(int jobSeekerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobSeeker>> getByJobSeekerNameContains(String jobSeekerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobSeeker>> getByJobSeekerNameStartsWith(String jobSeekerName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
