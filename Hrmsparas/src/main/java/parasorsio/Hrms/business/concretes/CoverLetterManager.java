package parasorsio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import parasorsio.Hrms.business.abstracts.CoverLetterService;
import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.core.utilities.Result.SuccessDataResult;
import parasorsio.Hrms.core.utilities.Result.SuccessResult;
import parasorsio.Hrms.dataAccess.abstracts.CoverLetterDao;
import parasorsio.Hrms.entities.concretes.CoverLetter;

@Service
public class CoverLetterManager implements CoverLetterService {

	private CoverLetterDao coverLetterDao;

	@Autowired
	public CoverLetterManager(CoverLetterDao coverLetterDao) {
		super();
		this.coverLetterDao = coverLetterDao;
	}

	@Override
	public Result add(CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult();
	}

	@Override
	public Result update(CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult();
	}

	@Override
	public Result delete(int id) {
		this.coverLetterDao.deleteById(id);
		return new SuccessResult();
	}

	@Override
	public DataResult<CoverLetter> getById(int id) {

		return new SuccessDataResult<CoverLetter>(this.coverLetterDao.getByCoverLetterId(id));
	}

	@Override
	public DataResult<List<CoverLetter>> getAll() {
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterDao.findAll());
	}

}
