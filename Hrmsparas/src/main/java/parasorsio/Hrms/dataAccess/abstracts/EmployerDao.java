package parasorsio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

	
	List<Employer> getfindcompanyName(String name);
	List<Employer> getfindemployerId(int id);
	
	
	List<Employer> getAllcompanyName(String name);
	List<Employer> getAllemployerId(int id);
	
}
