package parasorsio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import parasorsio.Hrms.business.abstracts.JobAdvertService;
import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.core.utilities.Result.SuccessDataResult;
import parasorsio.Hrms.core.utilities.Result.SuccessResult;
import parasorsio.Hrms.dataAccess.abstracts.JobAdvertDao;
import parasorsio.Hrms.entities.concretes.JobAdvert;

@Service
public class JobAdvertManager implements JobAdvertService {

	private JobAdvertDao jobAdvertDao;

	@Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}

	@Override
	public Result add(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult();
	}

	@Override
	public Result update(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult();
	}

	@Override
	public Result delete(int id) {
		this.jobAdvertDao.deleteById(id);
		return new SuccessResult();

	}

	@Override
	public DataResult<JobAdvert> getById(int id) {
		return new SuccessDataResult<JobAdvert>(this.jobAdvertDao.getById(id));
	}

	@Override
	public DataResult<List<JobAdvert>> getAll() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll());
	}

	@Override
	public DataResult<List<JobAdvert>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<JobAdvert>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.ASC, "jobAdvertName");
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll(sort));
	}

	@Override
	public DataResult<JobAdvert> getByJobAdvertName(String jobAdvertName) {
		return new SuccessDataResult<JobAdvert>(this.jobAdvertDao.getByJobAdvertName(jobAdvertName));

	}

	@Override
	public DataResult<List<JobAdvert>> getByJobAdvertNameStartsWith(String jobAdvertName) {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getByJobAdvertNameStartsWith(jobAdvertName));

	}

	@Override
	public DataResult<List<JobAdvert>> getByJobAdvertAdvertiserCompany(String jobAdvertAdvertiserCompany) {
		return new SuccessDataResult<List<JobAdvert>>(
				this.jobAdvertDao.getByJobAdvertAdvertiserCompany(jobAdvertAdvertiserCompany));

	}

	@Override
	public DataResult<List<JobAdvert>> getByJobAdvertNameContains(String jobAdvertName) {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getByJobAdvertNameContains(jobAdvertName));
	}

}
