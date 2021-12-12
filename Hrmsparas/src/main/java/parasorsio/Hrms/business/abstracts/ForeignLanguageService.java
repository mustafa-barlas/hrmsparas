package parasorsio.Hrms.business.abstracts;

import java.util.List;

import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.entities.concretes.ForeignLanguage;

public interface ForeignLanguageService {

	Result add(ForeignLanguage foreignLanguage);

	Result update(ForeignLanguage foreignLanguage);

	Result delete(int id);

	DataResult<ForeignLanguage> getById(int id);

	DataResult<List<ForeignLanguage>> getAll();

	DataResult<List<ForeignLanguage>> getAll(int pageNo, int pageSize);

	DataResult<List<ForeignLanguage>> getAllSorted();

	DataResult<List<ForeignLanguage>> getByForeignLanguageNameAndLevel(String foreignLanguageName,int foreignLanguageLevel);
}
