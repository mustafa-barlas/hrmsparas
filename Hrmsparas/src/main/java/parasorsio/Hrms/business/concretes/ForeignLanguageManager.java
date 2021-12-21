package parasorsio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import parasorsio.Hrms.business.abstracts.ForeignLanguageService;
import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.core.utilities.result.SuccessDataResult;
import parasorsio.Hrms.core.utilities.result.SuccessResult;
import parasorsio.Hrms.dataAccess.abstracts.ForeignLanguageDao;
import parasorsio.Hrms.entities.concretes.ForeignLanguage;

@Service

public class ForeignLanguageManager implements ForeignLanguageService {

	private ForeignLanguageDao foreignLanguageDao;

	@Autowired
	public ForeignLanguageManager(ForeignLanguageDao foreignLanguageDao) {
		super();
		this.foreignLanguageDao = foreignLanguageDao;
	}

	@Override
	public Result add(ForeignLanguage foreignLanguage) {
		this.foreignLanguageDao.save(foreignLanguage);
		return new SuccessResult();
	}

	@Override
	public Result update(ForeignLanguage foreignLanguage) {
		this.foreignLanguageDao.save(foreignLanguage);
		return new SuccessResult();
	}

	@Override
	public Result delete(int id) {
		this.foreignLanguageDao.deleteById(id);
		return new SuccessResult();
	}

	@Override
	public DataResult<ForeignLanguage> getById(int id) {

		return new SuccessDataResult<ForeignLanguage>(this.foreignLanguageDao.getByForeignLanguageId(id));
	}

	@Override
	public DataResult<List<ForeignLanguage>> getAll() {

		return new SuccessDataResult<List<ForeignLanguage>>(this.foreignLanguageDao.findAll());
	}

	@Override
	public DataResult<List<ForeignLanguage>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
		return new SuccessDataResult<List<ForeignLanguage>>(this.foreignLanguageDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<ForeignLanguage>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.ASC, "languageName");
		return new SuccessDataResult<List<ForeignLanguage>>(this.foreignLanguageDao.findAll(sort));
	}

	@Override
	public DataResult<List<ForeignLanguage>> getByForeignLanguageNameAndLevel(String foreignLanguageName,
			int foreignLanguageLevel) {

		return new SuccessDataResult<List<ForeignLanguage>>(
				this.foreignLanguageDao.getByForeignLanguageNameAndLevel(foreignLanguageName, foreignLanguageLevel));
	}

}
