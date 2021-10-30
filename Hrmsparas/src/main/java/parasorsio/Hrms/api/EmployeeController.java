package parasorsio.Hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import parasorsio.Hrms.business.abstracts.EmployeeService;
import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employee_controllers")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService=employeeService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Employee>> getAll(){
		
		return this.employeeService.getAll();
		
	}
	@PostMapping("/add")
	public Result add(@RequestBody Employee employee) {
		
		return this.employeeService.add(employee);
	}

}
