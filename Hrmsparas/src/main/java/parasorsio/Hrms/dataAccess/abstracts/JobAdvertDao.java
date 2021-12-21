package parasorsio.Hrms.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import parasorsio.Hrms.entities.concretes.JobAdvert;
import parasorsio.Hrms.entities.dtos.JobAdvertWithJobPositionDto;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer> {

	JobAdvert getById(int id);

	JobAdvert getByJobAdvertName(String jobAdvertName);

	JobAdvert getByOpenPosition(int jobAdvertOpenPosition);

	JobAdvert getByAdvertDeadline(LocalDate jobAdvertDeadline);

	List<JobAdvert> getByPosition(String jobPosition);

	List<JobAdvert> getByCity(String city);

	JobAdvert getByMaxSalary(int jobAdvertMaxSalary);

	JobAdvert getByMinSalary(int jobAdvertMinSalary);

	List<JobAdvert> getByJobAdvertNameContains(String jobAdvertName);

	List<JobAdvert> getByJobAdvertNameStartsWith(String jobAdvertName);

	List<JobAdvert> getByJobAdvertAdvertiserCompany(String jobAdvertAdvertiserCompany);

	@Query("From JobAdvert where jobAdvertName=:jobAdvertName and jobAdvertId=:jobAdvertId")
	List<JobAdvert> getByNameAndId(String jobAdvertName, int jobAdvertId);

	@Query("Select new  parasorsio.Hrms.entities.dtos.JobAdvertWithJobPositionDto("
			+ "advert.jobAdvertId, advert.jobAdvertName, position.positionName)"
			+ " From JobPosition position Inner Join position.jobAdverts advert ")
	List<JobAdvertWithJobPositionDto> getJobAdvertDetails();

}
