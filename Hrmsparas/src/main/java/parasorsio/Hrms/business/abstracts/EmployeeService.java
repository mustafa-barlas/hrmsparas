package parasorsio.Hrms.business.abstracts;

import java.util.List;

import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.entities.concretes.Employee;

public interface EmployeeService {

	Result add(Employee employee);

	Result update(Employee employee);

	Result delete(int id);

	DataResult<Employee> getByEmployeeName(String employeeName);

	DataResult<Employee> getById(int id);

	DataResult<Employee> getByEmployeeIdAndEmployeeName(int employeeId, String employyeName);

	DataResult<List<Employee>> getAll();

	DataResult<List<Employee>> getAll(int pageNo, int PageSize);

	DataResult<List<Employee>> getAllSorted();

	DataResult<List<Employee>> getByEmployeeNameContains(String employeeName);

	DataResult<List<Employee>> getByEmployeeNameStartsWith(String employeeName);

}
