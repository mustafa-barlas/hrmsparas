package parasorsio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import parasorsio.Hrms.business.abstracts.EmployerService;
import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.core.utilities.Result.SuccessDataResult;
import parasorsio.Hrms.core.utilities.Result.SuccessResult;
import parasorsio.Hrms.dataAccess.abstracts.EmployerDao;
import parasorsio.Hrms.entities.concretes.Employer;
@Service
public class EmployerManager implements EmployerService {

	
	private EmployerDao  employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao=employerDao;
	}
	
	
	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "tüm iş verenler getirildi");
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("iş veren eklendi");
	}

	@Override
	public Result update(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

}
