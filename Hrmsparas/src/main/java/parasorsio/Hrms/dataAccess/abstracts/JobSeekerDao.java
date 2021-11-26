package parasorsio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {

	JobSeeker getByJobSeekerNameAndJobSeekerSurname(String jobSeekerName, String jobSeekerSurname);

	JobSeeker getByJobSeekerTc(String jobSeekerTc);

	JobSeeker getByJobSeekerId(int jobSeekerId);

	List<JobSeeker> getByJobSeekerNameContains(String jobSeekerName);

	List<JobSeeker> getByJobSeekerNameStartsWith(String jobSeekerName);

}
