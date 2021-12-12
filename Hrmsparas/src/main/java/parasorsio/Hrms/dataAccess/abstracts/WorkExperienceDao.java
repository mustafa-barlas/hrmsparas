package parasorsio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.entities.concretes.WorkExperience;

public interface WorkExperienceDao extends JpaRepository<WorkExperience, Integer> {

	WorkExperience getByWorkExperienceId(int workExperienceId);

	WorkExperience getByWorkExperienceDescription(String workExperienceDescription);
}
