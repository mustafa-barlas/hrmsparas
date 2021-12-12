package parasorsio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.entities.concretes.EducationInformation;

public interface EducationInformationDao extends JpaRepository<EducationInformation, Integer> {

	EducationInformation getByEducationId(int educationId);

	List<EducationInformation> getBySchoolInformation(String SchoolInformation);

}
