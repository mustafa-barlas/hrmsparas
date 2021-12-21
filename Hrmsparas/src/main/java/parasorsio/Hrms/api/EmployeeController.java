package parasorsio.Hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import parasorsio.Hrms.business.abstracts.EmployeeService;
import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employees/")
public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@PostMapping("add")
	public Result add(@RequestBody Employee employee) {
		return this.employeeService.add(employee);
	}

	@PostMapping("update")
	public Result update(@RequestBody Employee employee) {
		return this.employeeService.update(employee);

	}

	@PostMapping("delete")
	public Result delete(int id) {
		return this.employeeService.delete(id);

	}

	@GetMapping("getAll")
	public DataResult<List<Employee>> getAll() {
		return this.employeeService.getAll();

	}

	@GetMapping("getById")
	public DataResult<Employee> getById(int id) {
		return this.employeeService.getById(id);
	}

	@GetMapping("pageable")
	public DataResult<List<Employee>> getAll(int pageNo, int PageSize) {
		return this.employeeService.getAll(pageNo, PageSize);
	}

	@GetMapping("getSorted")
	public DataResult<List<Employee>> getAllSorted() {
		return this.employeeService.getAllSorted();
	}

	@GetMapping("getEmployeeName")
	public DataResult<Employee> getByEmployeeName(@RequestParam String employeeName) {
		return this.employeeService.getByEmployeeName(employeeName);
	}

	@GetMapping("getByEmployeeNameContains")
	public DataResult<List<Employee>> getByEmployeeNameContains(@RequestParam String employeeName) {
		return this.employeeService.getByEmployeeNameContains(employeeName);
	}

	@GetMapping("getByEmployeeNameStartsWith")
	public DataResult<List<Employee>> getByEmployeeNameStartsWith(@RequestParam String employeeName) {
		return this.employeeService.getByEmployeeNameStartsWith(employeeName);
	}

	@GetMapping("getByEmployeeIdAndEmployeeName")
	public DataResult<Employee> getByEmployeeIdAndEmployeeName(int employeeId, String employyeName) {
		return this.employeeService.getByEmployeeIdAndEmployeeName(employeeId, employyeName);
	}

}
