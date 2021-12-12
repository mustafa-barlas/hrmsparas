package parasorsio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import parasorsio.Hrms.business.abstracts.JobSeekerService;
import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.core.utilities.Result.SuccessDataResult;
import parasorsio.Hrms.core.utilities.Result.SuccessResult;
import parasorsio.Hrms.dataAccess.abstracts.JobSeekerDao;
import parasorsio.Hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;

	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult();
	}

	@Override
	public Result update(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult();
	}

	@Override
	public Result delete(int id) {
		this.jobSeekerDao.deleteById(id);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<JobSeeker>> getByJobSeekerNameAndJobSeekerSurname(String jobSeekerName,
			String jobSeekerSurname) {

		return new SuccessDataResult<List<JobSeeker>>(
				this.jobSeekerDao.getByJobSeekerNameAndJobSeekerSurname(jobSeekerName, jobSeekerSurname));
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {

		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll());
	}

	@Override
	public DataResult<List<JobSeeker>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);

		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<JobSeeker>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.ASC, "jobSeekerName");

		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(sort));
	}

	@Override
	public DataResult<List<JobSeeker>> getByJobSeekerNameContains(String jobSeekerName) {

		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.getByJobSeekerNameContains(jobSeekerName));
	}

	@Override
	public DataResult<List<JobSeeker>> getByJobSeekerNameStartsWith(String jobSeekerName) {

		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.getByJobSeekerNameStartsWith(jobSeekerName));
	}

	@Override
	public DataResult<JobSeeker> getById(int id) {

		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.getByJobSeekerId(id));
	}

}
