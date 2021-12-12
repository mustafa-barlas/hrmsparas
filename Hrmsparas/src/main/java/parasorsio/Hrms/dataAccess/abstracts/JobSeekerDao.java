package parasorsio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import parasorsio.Hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {

	JobSeeker getByJobSeekerId(int jobSeekerId);

	JobSeeker getByJobSeekerName(String jobSeekerName);

	JobSeeker getByJobSeekerSurname(String jobSeekerSurname);

	List<JobSeeker> getByJobSeekerNameContains(String jobSeekerName);

	List<JobSeeker> getByJobSeekerNameStartsWith(String jobSeekerName);

	@Query("From JobSeeker where jobSeekerName=:jobSeekerName and jobSeekerSurname=:jobSeekerSurname")
	List<JobSeeker> getByJobSeekerNameAndJobSeekerSurname(String jobSeekerName, String jobSeekerSurname);

}
