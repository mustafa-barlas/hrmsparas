package parasorsio.Hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import parasorsio.Hrms.business.abstracts.ForeignLanguageService;
import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.ForeignLanguage;

@RestController
@RequestMapping("/api/foreign_languages/")
public class ForeignLanguageController {

	private ForeignLanguageService foreignLanguageService;

	@Autowired
	public ForeignLanguageController(ForeignLanguageService foreignLanguageService) {
		super();
		this.foreignLanguageService = foreignLanguageService;
	}

	@PostMapping("add")
	public Result add(@RequestBody ForeignLanguage foreignLanguage) {

		return this.foreignLanguageService.add(foreignLanguage);
	}

	@PostMapping("update")
	public Result update(@RequestBody ForeignLanguage foreignLanguage) {

		return this.foreignLanguageService.update(foreignLanguage);
	}

	@PostMapping("delete")
	public Result delete(int id) {

		return this.foreignLanguageService.delete(id);
	}

	@GetMapping("getById")
	public DataResult<ForeignLanguage> getById(int id) {

		return this.foreignLanguageService.getById(id);
	}

	@GetMapping("getAll")
	public DataResult<List<ForeignLanguage>> getAll() {

		return this.foreignLanguageService.getAll();

	}

	@GetMapping("pageable")
	public DataResult<List<ForeignLanguage>> getByPageable(int pageNo, int pageSize) {

		return this.foreignLanguageService.getAll(pageNo, pageNo);

	}

	@GetMapping("sorted")
	public DataResult<List<ForeignLanguage>> getBySort() {

		return this.foreignLanguageService.getAllSorted();
	}

	@GetMapping("languageNameAndLevel")
	public DataResult<List<ForeignLanguage>> getByForeignLanguageNameAndLevel(String foreignLanguageName,
			int foreignLanguageLevel) {

		return this.foreignLanguageService.getByForeignLanguageNameAndLevel(foreignLanguageName, foreignLanguageLevel);
	}

}
