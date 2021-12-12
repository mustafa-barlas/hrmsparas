package parasorsio.Hrms.business.abstracts;

import java.util.List;

import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.entities.concretes.EducationInformation;

public interface EducationInformationService {

	Result add(EducationInformation educationInformation);

	Result update(EducationInformation educationInformation);

	Result delete(int id);

	DataResult<EducationInformation> getById(int id);

	DataResult<List<EducationInformation>> getAll();

	DataResult<List<EducationInformation>> getAll(int pageNo, int pageSize);

	DataResult<List<EducationInformation>> getAllSorted();
}
