package parasorsio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Result add(JobPosition jonPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(JobPosition jonPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<JobPosition> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<JobPosition> getAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<JobPosition> getBySorted() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<JobPosition> getByJobPositionName(String positionName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<JobPosition> getByJobPositionId(int positionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobPosition>> getByJobPositionIdAndName(int positionId, String positionName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobPosition>> getByJobPositionNameContains(String positionName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobPosition>> getByJobPositionNameStartsWith(String positionName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
