package parasorsio.Hrms.business.abstracts;

import java.util.List;

import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.entities.concretes.Employer;


public interface EmployerService {

	DataResult<List<Employer>> getAll();
	
	Result add(Employer employer);
	Result update(Employer employer);
	Result delete(Employer employer);
	
}
