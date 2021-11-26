package parasorsio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import parasorsio.Hrms.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer> {

	JobAdvert getByJobAdvertName(String jobAdvertName);

	JobAdvert getByJobAdvertNameAndCategory_CategoryId(String jobAdvertName, int categoryId);

	List<JobAdvert> getByCategory_CategoryIdIn(List<Integer> category);

	List<JobAdvert> getByJobPositionIdIn(List<Integer> positions);

	List<JobAdvert> getByJobAdvertNameContains(String jobAdvertName);

	List<JobAdvert> getByJobAdvertNameStartsWith(String jobAdvertName);

	List<JobAdvert> getByJobAdvertAdvertiserCompany(String jobAdvertAdvertiserCompany);

	@Query("From JobAdvert where jobAdvertName=:jobAdvertName and category.categoryId=:categoryId")
	List<JobAdvert> getByNameAndCategory(String jobAdvertName, int categoryId);

}
