package parasorsio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer> {

	
	List<JobAdvert> getfindjobAdvertId(int id);
	List<JobAdvert> getfindadvertiserCompany(String name);
	
	
	List<JobAdvert> getAlljobAdvertId(int id);
}
