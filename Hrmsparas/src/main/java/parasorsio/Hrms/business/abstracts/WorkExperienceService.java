package parasorsio.Hrms.business.abstracts;

import java.util.List;

import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.WorkExperience;

public interface WorkExperienceService {

	Result add(WorkExperience workExperience);

	Result update(WorkExperience workExperience);

	Result delete(int id);

	DataResult<WorkExperience> getById(int id);

	DataResult<WorkExperience> getByWorkExperienceDescription(String workExperienceDescription);

	DataResult<List<WorkExperience>> getAll();

	DataResult<List<WorkExperience>> getAll(int pageNo, int pageSize);

	DataResult<List<WorkExperience>> getAllSorted();

}
