package parasorsio.Hrms.business.abstracts;

import java.util.List;

import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.entities.concretes.Skill;

public interface SkillService {

	Result add(Skill skill);

	Result update(Skill skill);

	Result delete(int id);

	DataResult<Skill> getById(int id);

	DataResult<List<Skill>> getAll();

	DataResult<List<Skill>> getAll(int pageNo, int pageSize);

	DataResult<List<Skill>> getAllSorted();

	DataResult<List<Skill>> getBySkillDescription(String skillDescription);
}
