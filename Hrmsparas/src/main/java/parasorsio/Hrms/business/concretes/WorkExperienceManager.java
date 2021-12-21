package parasorsio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import parasorsio.Hrms.business.abstracts.WorkExperienceService;
import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.core.utilities.result.SuccessDataResult;
import parasorsio.Hrms.core.utilities.result.SuccessResult;
import parasorsio.Hrms.dataAccess.abstracts.WorkExperienceDao;
import parasorsio.Hrms.entities.concretes.WorkExperience;

@Service
public class WorkExperienceManager implements WorkExperienceService {

	private WorkExperienceDao workExperienceDao;

	@Autowired
	public WorkExperienceManager(WorkExperienceDao workExperienceDao) {
		super();
		this.workExperienceDao = workExperienceDao;
	}

	@Override
	public Result add(WorkExperience workExperience) {
		this.workExperienceDao.save(workExperience);
		return new SuccessResult();
	}

	@Override
	public Result update(WorkExperience workExperience) {
		this.workExperienceDao.save(workExperience);
		return new SuccessResult();
	}

	@Override
	public Result delete(int id) {
		this.workExperienceDao.deleteById(id);
		return new SuccessResult();
	}

	@Override
	public DataResult<WorkExperience> getById(int id) {

		return new SuccessDataResult<WorkExperience>(this.workExperienceDao.getByWorkExperienceId(id));
	}

	@Override
	public DataResult<WorkExperience> getByWorkExperienceDescription(String workExperienceDescription) {

		return new SuccessDataResult<WorkExperience>(
				this.workExperienceDao.getByWorkExperienceDescription(workExperienceDescription));
	}

	@Override
	public DataResult<List<WorkExperience>> getAll() {

		return new SuccessDataResult<List<WorkExperience>>(this.workExperienceDao.findAll());
	}

	@Override
	public DataResult<List<WorkExperience>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		return new SuccessDataResult<List<WorkExperience>>(this.workExperienceDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<WorkExperience>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.ASC, "workExperienceId");
		return new SuccessDataResult<List<WorkExperience>>(this.workExperienceDao.findAll(sort));
	}

}
