package parasorsio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

	Employer getByEmployerName(String employerName);
	
	Employer getByEmployerId(int employerId);
	
	List<Employer> getByEmployerPostigns(String employerPostigns);
	
	List<Employer> getByEmployerPosition(String employerPosition);
	
	List<Employer> getByEmployerNameContains(String employerName);
	
	List<Employer> getByEmployerNameStartsWith(String employerName);
	
	
	
	
	
}
