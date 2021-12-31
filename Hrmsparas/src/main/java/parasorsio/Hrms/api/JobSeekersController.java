package parasorsio.Hrms.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import parasorsio.Hrms.business.abstracts.JobSeekerService;
import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/job_seekers/")
public class JobSeekersController {

	private JobSeekerService JobSeekerService;

	public JobSeekersController(JobSeekerService JobSeekerService) {
		super();
		this.JobSeekerService = JobSeekerService;
	}

	@PostMapping("add")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		return this.JobSeekerService.add(jobSeeker);
	}

	@PostMapping("update")
	public Result update(JobSeeker jobSeeker) {

		return this.JobSeekerService.update(jobSeeker);
	}

	@PostMapping("delete")
	public Result delete(int id) {

		return this.JobSeekerService.delete(id);
	}

	@GetMapping("seekerNameAndSurname")
	public DataResult<List<JobSeeker>> getByJobSeekerNameAndJobSeekerSurname(String jobSeekerName, String jobSeekerSurname) {

		return this.getByJobSeekerNameAndJobSeekerSurname(jobSeekerName, jobSeekerSurname);
	}

	@GetMapping("getAll")
	public DataResult<List<JobSeeker>> getAll() {

		return this.JobSeekerService.getAll();
	}

	@GetMapping("pageable")
	public DataResult<List<JobSeeker>> getAll(int pageNo, int pageSize) {

		return this.JobSeekerService.getAll(pageNo, pageSize);
	}

	@GetMapping("seekerSort")
	public DataResult<List<JobSeeker>> getAllSorted() {

		return this.JobSeekerService.getAllSorted();

	}

	@GetMapping("seekerNameContains")
	public DataResult<List<JobSeeker>> getByJobSeekerNameContains(String jobSeekerName) {

		return this.JobSeekerService.getByJobSeekerNameContains(jobSeekerName);
	}

	@GetMapping("seekerNameStartsWith")
	public DataResult<List<JobSeeker>> getByJobSeekerNameStartsWith(String jobSeekerName) {

		return this.JobSeekerService.getByJobSeekerNameStartsWith(jobSeekerName);
	}

	@GetMapping("getById")
	public DataResult<JobSeeker> getById(int id) {

		return this.JobSeekerService.getById(id);
	}

	@GetMapping("cityId")
	public DataResult<JobSeeker> getByCityId(int cityId) {

		return this.getByCityId(cityId);
	}

	@GetMapping("coverLetterId")
	public DataResult<JobSeeker> getByCoverLetterId(int coverLetterId) {

		return this.JobSeekerService.getByCoverLetterId(coverLetterId);
	}

	@GetMapping("educationId")
	public DataResult<JobSeeker> getByEducationId(int educationInformationId) {

		return this.getByEducationId(educationInformationId);
	}

	@GetMapping("languageId")
	public DataResult<JobSeeker> getByLanguageId(int foreignLanguageId) {

		return this.JobSeekerService.getByLanguageId(foreignLanguageId);
	}

	@GetMapping("skillId")
	public DataResult<JobSeeker> getBySkillId(int skillId) {

		return this.JobSeekerService.getBySkillId(skillId);
	}

	@GetMapping("socialMediaId")
	public DataResult<JobSeeker> getBySocialMediaId(int socialMediaId) {

		return getBySocialMediaId(socialMediaId);
	}

	@GetMapping("workExperience")
	public DataResult<JobSeeker> getByWorkExperience(int workExperienceId) {

		return this.JobSeekerService.getByWorkExperienceId(workExperienceId);
	}

}
