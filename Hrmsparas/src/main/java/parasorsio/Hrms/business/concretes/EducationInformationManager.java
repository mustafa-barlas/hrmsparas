package parasorsio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import parasorsio.Hrms.business.abstracts.EducationInformationService;
import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.core.utilities.Result.SuccessDataResult;
import parasorsio.Hrms.core.utilities.Result.SuccessResult;
import parasorsio.Hrms.dataAccess.abstracts.EducationInformationDao;
import parasorsio.Hrms.entities.concretes.EducationInformation;

@Service

public class EducationInformationManager implements EducationInformationService {

	private EducationInformationDao educationInformationDao;

	@Autowired
	public EducationInformationManager(EducationInformationDao educationInformationDao) {
		super();
		this.educationInformationDao = educationInformationDao;
	}

	@Override
	public Result add(EducationInformation educationInformation) {
		this.educationInformationDao.save(educationInformation);
		return new SuccessResult();
	}

	@Override
	public Result update(EducationInformation educationInformation) {
		this.educationInformationDao.save(educationInformation);
		return new SuccessResult();
	}

	@Override
	public Result delete(int id) {
		this.educationInformationDao.deleteById(id);
		return new SuccessResult();
	}

	@Override
	public DataResult<EducationInformation> getById(int id) {

		return new SuccessDataResult<EducationInformation>(this.educationInformationDao.getByEducationId(id));
	}

	@Override
	public DataResult<List<EducationInformation>> getAll() {

		return new SuccessDataResult<List<EducationInformation>>(this.educationInformationDao.findAll());
	}

	@Override
	public DataResult<List<EducationInformation>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
		return new SuccessDataResult<List<EducationInformation>>(
				this.educationInformationDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<EducationInformation>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.ASC, "schoolStart");
		return new SuccessDataResult<List<EducationInformation>>(this.educationInformationDao.findAll(sort));
	}

}
