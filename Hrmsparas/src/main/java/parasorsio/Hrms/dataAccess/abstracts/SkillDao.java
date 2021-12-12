package parasorsio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.entities.concretes.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer> {

	Skill getBySkillId(int skillId);

	List<Skill> getBySkillDescription(String skillDescription);
}
