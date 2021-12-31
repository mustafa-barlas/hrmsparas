package parasorsio.Hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import parasorsio.Hrms.business.abstracts.EmployerService;
import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers/")
public class EmployersController {

	private EmployerService employerService;

	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;

	}

	@PostMapping("add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
	}

	@PostMapping("update")
	public Result update(Employer employer) {
		return this.employerService.update(employer);

	}

	@PostMapping("delete")
	public Result delete(int id) {
		return this.employerService.delete(id);

	}

	@GetMapping("getAll")
	public DataResult<List<Employer>> getAll() {
		return this.employerService.getAll();
	}

	@GetMapping("getById")
	public DataResult<Employer> getById(int id) {
		return this.employerService.getById(id);
	}

	@GetMapping("pageable")
	public DataResult<List<Employer>> getAll(int pageNo, int pageSize) {

		return this.employerService.getAll(pageNo, pageSize);
	}

	@GetMapping("Sorted")
	public DataResult<List<Employer>> getAllSorted() {

		return this.employerService.getAllSorted();
	}

	@GetMapping("EmployerName")
	public DataResult<Employer> getByEmployerName(@RequestParam String employerName) {

		return this.employerService.getByEmployerName(employerName);
	}

	@GetMapping("employerPostings")
	public DataResult<List<Employer>> getByEmployerPostigns(@RequestParam String employerPostigns) {

		return this.employerService.getByEmployerPostigns(employerPostigns);
	}

	@GetMapping("employerPosition")
	public DataResult<List<Employer>> getByEmployerPosition(@RequestParam String employerPosition) {

		return this.employerService.getByEmployerPosition(employerPosition);
	}

	@GetMapping("employerNameContains")
	public DataResult<List<Employer>> getByEmployerNameContains(@RequestParam String employerName) {

		return this.employerService.getByEmployerNameContains(employerName);
	}

	@GetMapping("employerStartsWith")
	public DataResult<List<Employer>> getByEmployerNameStartsWith(@RequestParam String employerName) {

		return this.employerService.getByEmployerNameStartsWith(employerName);
	}

}
