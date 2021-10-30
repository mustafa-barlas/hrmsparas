package parasorsio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	List<Employee> getfindname(String name);
	List<Employee> getfindemployeeId(int id);
	List<Employee> getfindtc(String name);
	
	
	List<Employee> getAllname(String name);
	List<Employee> getAllemployeeId(int id);
}
