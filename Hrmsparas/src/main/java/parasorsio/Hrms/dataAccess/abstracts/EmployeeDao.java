package parasorsio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	Employee getByEmployeeName(String employeeName);

	Employee getByEmployeeId(int employeeId);

	Employee getByEmployeeIdAndEmployeeName(int employeeId, String employyeName);

	List<Employee> getByEmployeeNameContains(String employeeName);

	List<Employee> getByEmployeeNameStartsWith(String employeeName);
}
