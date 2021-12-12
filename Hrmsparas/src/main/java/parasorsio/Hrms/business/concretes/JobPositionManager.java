package parasorsio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import parasorsio.Hrms.business.abstracts.JobPositionService;
import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.core.utilities.Result.SuccessDataResult;
import parasorsio.Hrms.core.utilities.Result.SuccessResult;
import parasorsio.Hrms.dataAccess.abstracts.JobPositionDao;
import parasorsio.Hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;

	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult();
	}

	@Override
	public Result update(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult();
	}

	@Override
	public Result delete(int id) {
		this.jobPositionDao.deleteById(id);
		return new SuccessResult();
	}

	@Override
	public DataResult<JobPosition> getById(int id) {

		return new SuccessDataResult<JobPosition>(this.jobPositionDao.getById(id));

	}

	@Override
	public DataResult<JobPosition> getByJobPositionName(String positionName) {

		return new SuccessDataResult<JobPosition>(this.jobPositionDao.getByJobPositionName(positionName));
	}

	@Override
	public DataResult<List<JobPosition>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);

		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<JobPosition>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.ASC, "positionName");

		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(sort));
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {

		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll());
	}

	@Override
	public DataResult<List<JobPosition>> getByJobPositionNameContains(String positionName) {

		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.getByJobPositionNameContains(positionName));
	}

	@Override
	public DataResult<List<JobPosition>> getByJobPositionNameStartsWith(String positionName) {

		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.getByJobPositionNameStartsWith(positionName));
	}

}
