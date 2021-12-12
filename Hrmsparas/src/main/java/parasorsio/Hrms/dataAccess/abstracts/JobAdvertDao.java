package parasorsio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import parasorsio.Hrms.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer> {

	JobAdvert getById(int id);

	JobAdvert getByJobAdvertName(String jobAdvertName);

	List<JobAdvert> getByJobAdvertNameContains(String jobAdvertName);

	List<JobAdvert> getByJobAdvertNameStartsWith(String jobAdvertName);

	List<JobAdvert> getByJobAdvertAdvertiserCompany(String jobAdvertAdvertiserCompany);

	@Query("From JobAdvert where jobAdvertName=:jobAdvertName and jobAdvertDescription=:jobAdvertDescription")
	List<JobAdvert> getByNameAndDescription(String jobAdvertName, String jobAdvertDescription);

}
