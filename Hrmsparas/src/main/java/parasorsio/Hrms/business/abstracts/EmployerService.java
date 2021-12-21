package parasorsio.Hrms.business.abstracts;

import java.util.List;

import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.Employer;

public interface EmployerService {

	Result add(Employer employer);

	Result update(Employer employer);

	Result delete(int id);

	DataResult<Employer> getByEmployerName(String employerName);

	DataResult<Employer> getById(int id);

	DataResult<List<Employer>> getAll();

	DataResult<List<Employer>> getAll(int pageNo, int pageSize);

	DataResult<List<Employer>> getAllSorted();

	DataResult<List<Employer>> getByEmployerPostigns(String employerPostigns);

	DataResult<List<Employer>> getByEmployerPosition(String employerPosition);

	DataResult<List<Employer>> getByEmployerNameContains(String employerName);

	DataResult<List<Employer>> getByEmployerNameStartsWith(String employerName);

}
