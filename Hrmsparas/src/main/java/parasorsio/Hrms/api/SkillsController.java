package parasorsio.Hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import parasorsio.Hrms.business.abstracts.SkillService;
import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.Skill;

@RestController
@RequestMapping("/api/skills/")
public class SkillsController {

	private SkillService skillService;

	@Autowired
	public SkillsController(SkillService skillService) {
		super();
		this.skillService = skillService;
	}

	@PostMapping("add")
	public Result add(Skill skill) {

		return this.skillService.add(skill);
	}

	@PostMapping("update")
	public Result update(Skill skill) {

		return this.skillService.update(skill);
	}

	@PostMapping("delete")
	public Result delete(int id) {

		return this.skillService.delete(id);
	}

	@GetMapping("getById")
	public DataResult<Skill> getById(int id) {

		return this.skillService.getById(id);
	}

	@GetMapping("getAll")
	public DataResult<List<Skill>> getAll() {

		return this.skillService.getAll();
	}

	@GetMapping("skillDescripton")
	public DataResult<List<Skill>> getBySkillDescription(String skillDescription) {

		return this.skillService.getBySkillDescription(skillDescription);
	}

	@GetMapping("pageable")
	public DataResult<List<Skill>> getAll(int pageNo, int pageSize) {

		return this.skillService.getAll(pageNo, pageSize);
	}

	@GetMapping("getAllSort")
	public DataResult<List<Skill>> getAllSorted() {

		return this.skillService.getAllSorted();
	}
}
