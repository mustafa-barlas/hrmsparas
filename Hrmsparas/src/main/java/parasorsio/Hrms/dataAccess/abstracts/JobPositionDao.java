package parasorsio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

	List<JobPosition> getfindpositionId(int id);
	List<JobPosition> getfindname(String name);
	
	
	List<JobPosition> getAllpositionId(int id);
	List<JobPosition> getAllname(String name);
}
