package parasorsio.Hrms.business.abstracts;

import java.util.List;

import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.CoverLetter;

public interface CoverLetterService {

	Result add(CoverLetter coverLetter);

	Result update(CoverLetter coverLetter);

	Result delete(int id);

	DataResult<CoverLetter> getById(int id);

	DataResult<List<CoverLetter>> getAll();
}
