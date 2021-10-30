package parasorsio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import parasorsio.Hrms.business.abstracts.EmployeeService;
import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.core.utilities.Result.SuccessDataResult;
import parasorsio.Hrms.core.utilities.Result.SuccessResult;
import parasorsio.Hrms.dataAccess.abstracts.EmployeeDao;
import parasorsio.Hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;

	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;

	}

	@Override
	public DataResult<List<Employee>> getAll() {

		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(), "tüm veriler getirildi");
	}

	@Override
	public Result add(Employee employee) {

		this.employeeDao.save(employee);
		return new SuccessResult("çalışan eklendi");
	}

	@Override
	public Result update(Employee employee) {

		return null;
	}

	@Override
	public Result delete(Employee employee) {

		return null;
	}

}
