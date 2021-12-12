package parasorsio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
	public Result add(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult();
	}

	@Override
	public Result update(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult();
	}

	@Override
	public Result delete(int id) {
		this.employeeDao.deleteById(id);
		return new SuccessResult();
	}

	@Override
	public DataResult<Employee> getById(int id) {
		return new SuccessDataResult<Employee>(this.employeeDao.getByEmployeeId(id));
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll());
	}

	@Override
	public DataResult<List<Employee>> getAll(int pageNo, int PageSize) {
		Pageable pageable = PageRequest.of(pageNo - 1, PageSize);
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<Employee>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.ASC, "employeeName");
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(sort));
	}

	@Override
	public DataResult<Employee> getByEmployeeName(String employeeName) {
		return new SuccessDataResult<Employee>(this.employeeDao.getByEmployeeName(employeeName));
	}

	@Override
	public DataResult<List<Employee>> getByEmployeeNameContains(String employeeName) {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.getByEmployeeNameContains(employeeName));
	}

	@Override
	public DataResult<List<Employee>> getByEmployeeNameStartsWith(String employeeName) {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.getByEmployeeNameStartsWith(employeeName));
	}

	@Override
	public DataResult<Employee> getByEmployeeIdAndEmployeeName(int employeeId, String employyeName) {

		return new SuccessDataResult<Employee>(this.employeeDao.getByEmployeeIdAndEmployeeName(employeeId, employyeName));
	}

}
