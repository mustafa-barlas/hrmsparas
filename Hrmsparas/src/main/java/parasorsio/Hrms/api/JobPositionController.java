package parasorsio.Hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import parasorsio.Hrms.business.abstracts.JobPositionService;
import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/job_positions/")
public class JobPositionController {

	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;

	}

	@PostMapping("add")
	public Result add(@RequestBody JobPosition jobPosition) {

		return this.jobPositionService.add(jobPosition);
	}

	@PostMapping("update")
	public Result update(@RequestBody JobPosition jobPosition) {

		return this.update(jobPosition);
	}

	@PostMapping("delete")
	public Result delete(int id) {

		return this.delete(id);
	}

	@GetMapping("jobPositionName")
	public DataResult<JobPosition> getById(int id) {

		return this.jobPositionService.getById(id);

	}

	@GetMapping("jobPositionName")
	public DataResult<JobPosition> getByJobPositionName(String positionName) {

		return this.jobPositionService.getByJobPositionName(positionName);
	}

	@GetMapping("pageable")
	public DataResult<List<JobPosition>> getByAll(int pageNo, int pageSize) {

		return this.jobPositionService.getAll(pageNo, pageSize);
	}

	@GetMapping("sorted")
	public DataResult<List<JobPosition>> getAllSorted() {

		return this.jobPositionService.getAllSorted();
	}

	@GetMapping("getAll")
	public DataResult<List<JobPosition>> getAll() {

		return this.jobPositionService.getAll();
	}

	@GetMapping("positionNameContains")
	public DataResult<List<JobPosition>> getByJobPositionNameContains(String positionName) {

		return this.jobPositionService.getByJobPositionNameContains(positionName);
	}

	@GetMapping("PositionNameStartsWith")
	public DataResult<List<JobPosition>> getByJobPositionNameStartsWith(String positionName) {

		return this.jobPositionService.getByJobPositionNameStartsWith(positionName);
	}
}
