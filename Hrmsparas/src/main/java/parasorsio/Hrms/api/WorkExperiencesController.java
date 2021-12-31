package parasorsio.Hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import parasorsio.Hrms.business.abstracts.WorkExperienceService;
import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.WorkExperience;

@RestController
@RequestMapping("/api/work_experiences/")
public class WorkExperiencesController {

	private WorkExperienceService workExperienceService;

	@Autowired
	public WorkExperiencesController(WorkExperienceService workExperienceService) {
		super();
		this.workExperienceService = workExperienceService;
	}

	@PostMapping("add")
	public Result add(WorkExperience workExperience) {

		return this.workExperienceService.add(workExperience);
	}

	@PostMapping("update")
	public Result update(WorkExperience workExperience) {

		return this.workExperienceService.update(workExperience);
	}

	@PostMapping("delete")
	public Result delete(int id) {

		return this.workExperienceService.delete(id);
	}

	@GetMapping("getById")
	public DataResult<WorkExperience> getById(int id) {

		return this.workExperienceService.getById(id);
	}

	@GetMapping("workDescription")
	public DataResult<WorkExperience> getByWorkExperienceDescription(String workExperienceDescription) {

		return this.workExperienceService.getByWorkExperienceDescription(workExperienceDescription);
	}

	@GetMapping("getAll")
	public DataResult<List<WorkExperience>> getAll() {

		return this.workExperienceService.getAll();
	}

	@GetMapping("pageable")
	public DataResult<List<WorkExperience>> getAll(int pageNo, int pageSize) {

		return this.workExperienceService.getAll(pageNo, pageSize);
	}

	@GetMapping("getAllSorted")
	public DataResult<List<WorkExperience>> getAllSorted() {

		return this.workExperienceService.getAllSorted();
	}
}
