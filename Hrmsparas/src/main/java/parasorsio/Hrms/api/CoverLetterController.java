package parasorsio.Hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import parasorsio.Hrms.business.abstracts.CoverLetterService;
import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.CoverLetter;

@RestController
@RequestMapping("/api/cover_letters/")
public class CoverLetterController {

	private CoverLetterService coverLetterService;

	@Autowired
	public CoverLetterController(CoverLetterService coverLetterService) {
		super();
		this.coverLetterService = coverLetterService;
	}

	@PostMapping("add")
	public Result add(@RequestBody CoverLetter coverLetter) {
		return this.coverLetterService.add(coverLetter);

	}

	@PostMapping("update")
	public Result update(@RequestBody CoverLetter coverLetter) {
		return this.coverLetterService.update(coverLetter);

	}

	@PostMapping("delete")
	public Result delete(int id) {
		return this.coverLetterService.delete(id);

	}

	@GetMapping("getById")
	public DataResult<CoverLetter> getById(int id) {
		return this.coverLetterService.getById(id);
	}

	@GetMapping("getAll")
	public DataResult<List<CoverLetter>> getAll() {
		return this.coverLetterService.getAll();
	}

}
