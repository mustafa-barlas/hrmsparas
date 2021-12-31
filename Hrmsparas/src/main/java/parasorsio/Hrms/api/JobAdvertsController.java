package parasorsio.Hrms.api;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import parasorsio.Hrms.business.abstracts.JobAdvertService;
import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.JobAdvert;
import parasorsio.Hrms.entities.dtos.JobAdvertWithJobPositionDto;

@RestController
@RequestMapping("/api/job_adverts/")
public class JobAdvertsController {

	private JobAdvertService jobAdvertService;

	@Autowired
	public JobAdvertsController(JobAdvertService jobAdvertService) { 
		super();
		this.jobAdvertService = jobAdvertService;
	}

	@PostMapping("add")
	public Result add(@RequestBody JobAdvert jobAdvert) {

		return this.jobAdvertService.add(jobAdvert);
	}

	@PostMapping("update")
	public Result update(@RequestBody JobAdvert jobAdvert) {

		return this.jobAdvertService.add(jobAdvert);

	}

	@PostMapping("delete")
	public Result delete(int id) {

		return this.jobAdvertService.delete(id);

	}

	@GetMapping("getById")
	public DataResult<JobAdvert> getById(int id) {

		return this.jobAdvertService.getById(id);
	}

	@GetMapping("getAll")
	public DataResult<List<JobAdvert>> getAll() {

		return this.jobAdvertService.getAll();

	}

	@GetMapping("getJobAdvertDetails")
	public DataResult<List<JobAdvertWithJobPositionDto>> getJobAdvertDetails() {

		return this.jobAdvertService.getJobAdvertDetails();

	}

	@GetMapping("getByJobAdvertName")
	public DataResult<JobAdvert> getByJobAdvertName(@RequestParam String jobAdvertName) {

		return this.jobAdvertService.getByJobAdvertName(jobAdvertName);
	}

	@GetMapping("getByJobAdvertNameContains")
	public DataResult<List<JobAdvert>> getByJobAdvertNameContains(@RequestParam String jobAdvertName) {

		return this.jobAdvertService.getByJobAdvertNameContains(jobAdvertName);
	}

	@GetMapping("advertStartsName")
	public DataResult<List<JobAdvert>> getByJobAdvertNameStartsWith(String jobAdvertName) {

		return this.jobAdvertService.getByJobAdvertNameStartsWith(jobAdvertName);

	}

	@GetMapping("getAllByPage")
	public DataResult<List<JobAdvert>> getAll(int pageNo, int pageSize) {

		return this.jobAdvertService.getAll(pageNo, pageSize);
	}

	@GetMapping("getAllASC")
	public DataResult<List<JobAdvert>> getAllSorted() {

		return this.jobAdvertService.getAllSorted();
	}

	@GetMapping("advertiserCompany")
	public DataResult<List<JobAdvert>> getByJobAdvertAdvertiserCompany(String jobAdvertAdvertiserCompany) {

		return this.jobAdvertService.getByJobAdvertAdvertiserCompany(jobAdvertAdvertiserCompany);

	}

	@GetMapping("openPosition")
	public DataResult<JobAdvert> getByOpenPosition(int jobAdvertOpenPosition) {

		return this.getByOpenPosition(jobAdvertOpenPosition);
	}

	@GetMapping("deadline")
	public DataResult<JobAdvert> getByAdvertDeadline(LocalDate jobAdvertDeadline) {

		return this.jobAdvertService.getByAdvertDeadline(jobAdvertDeadline);
	}

	@GetMapping("maxSalary")
	public DataResult<JobAdvert> getByMaxSalary(int jobAdvertMaxSalary) {

		return this.jobAdvertService.getByMaxSalary(jobAdvertMaxSalary);
	}

	@GetMapping("minSalary")
	public DataResult<JobAdvert> getByMinSalary(int jobAdvertMinSalary) {

		return this.jobAdvertService.getByMinSalary(jobAdvertMinSalary);
	}

	@GetMapping("advertPosition")
	public DataResult<List<JobAdvert>> getByPosition(String jobPosition) {

		return this.jobAdvertService.getByPosition(jobPosition);
	}

	@GetMapping("advertCity")
	public DataResult<List<JobAdvert>> getByCity(String city) {

		return this.jobAdvertService.getByCity(city);
	}

	@GetMapping("advertNameAndId")
	public DataResult<List<JobAdvert>> getByNameAndId(String jobAdvertName, int jobAdvertId) {

		return this.jobAdvertService.getByNameAndId(jobAdvertName, jobAdvertId);
	}

}
