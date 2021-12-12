package parasorsio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

	JobPosition getByJobPositionName(String positionName);

	JobPosition getById(int positionId);

	List<JobPosition> getByJobPositionNameContains(String positionName);

	List<JobPosition> getByJobPositionNameStartsWith(String positionName);
}
