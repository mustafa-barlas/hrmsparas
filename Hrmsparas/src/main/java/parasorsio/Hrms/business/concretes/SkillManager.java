package parasorsio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import parasorsio.Hrms.business.abstracts.SkillService;
import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.core.utilities.Result.SuccessDataResult;
import parasorsio.Hrms.core.utilities.Result.SuccessResult;
import parasorsio.Hrms.dataAccess.abstracts.SkillDao;
import parasorsio.Hrms.entities.concretes.Skill;

@Service
public class SkillManager implements SkillService {

	private SkillDao skillDao;

	@Autowired
	public SkillManager(SkillDao skillDao) {
		super();
		this.skillDao = skillDao;
	}

	@Override
	public Result add(Skill skill) {
		this.skillDao.save(skill);
		return new SuccessResult();
	}

	@Override
	public Result update(Skill skill) {
		this.skillDao.save(skill);
		return new SuccessResult();
	}

	@Override
	public Result delete(int id) {
		this.skillDao.deleteById(id);
		return new SuccessResult();
	}

	@Override
	public DataResult<Skill> getById(int id) {

		return new SuccessDataResult<Skill>(this.skillDao.getBySkillId(id));
	}

	@Override
	public DataResult<List<Skill>> getAll() {

		return new SuccessDataResult<List<Skill>>(this.skillDao.findAll());
	}

	@Override
	public DataResult<List<Skill>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
		return new SuccessDataResult<List<Skill>>(this.skillDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<Skill>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.ASC, "skillId");
		return new SuccessDataResult<List<Skill>>(this.skillDao.findAll(sort));
	}

	@Override
	public DataResult<List<Skill>> getBySkillDescription(String skillDescription) {

		return new SuccessDataResult<List<Skill>>(this.skillDao.getBySkillDescription(skillDescription));
	}

}
