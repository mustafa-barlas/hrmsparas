package parasorsio.Hrms.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import parasorsio.Hrms.business.abstracts.JobSeekerService;
import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers/")
public class JobSeekerController {

	private JobSeekerService JobSeekerService;

	public JobSeekerController(JobSeekerService JobSeekerService) {
		super();
		this.JobSeekerService = JobSeekerService;
	}

	@GetMapping("getAll")
	public DataResult<List<JobSeeker>> getAll() {
		return this.JobSeekerService.getAll();
	}

	@PostMapping("add")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		return this.JobSeekerService.add(jobSeeker);
	}
}
