package parasorsio.Hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import parasorsio.Hrms.business.abstracts.EducationInformationService;
import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.EducationInformation;

@RequestMapping("/ap/education_informations/")
@RestController
public class EducationInformationsController {

	private EducationInformationService educationInformationService;

	@Autowired
	public EducationInformationsController(EducationInformationService educationInformationService) {
		super();
		this.educationInformationService = educationInformationService;
	}

	@PostMapping("add")
	public Result add(@RequestBody EducationInformation educationInformation) {
		return this.educationInformationService.add(educationInformation);

	}

	@PostMapping("update")
	public Result update(@RequestBody EducationInformation educationInformation) {
		return this.educationInformationService.update(educationInformation);

	}

	@PostMapping("delete")
	public Result delete(int id) {
		return this.educationInformationService.delete(id);

	}

	@GetMapping("getById")
	public DataResult<EducationInformation> getById(int id) {
		return this.educationInformationService.getById(id);
	}

	@GetMapping("getAll")
	public DataResult<List<EducationInformation>> getAll() {
		return this.educationInformationService.getAll();
	}

	@GetMapping("pageable")
	public DataResult<List<EducationInformation>> getAll(int pageNo, int pageSize) {
		return this.educationInformationService.getAll(pageNo, pageSize);
	}

	@GetMapping("getSorted")
	public DataResult<List<EducationInformation>> getAllSorted() {
		return this.educationInformationService.getAllSorted();
	}

}
