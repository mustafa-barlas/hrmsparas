package parasorsio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {

	
	List<JobSeeker> getfindjobSeekerId(int id);
	List<JobSeeker> getfindname(String name);
	List<JobSeeker> getfindtc(String tc);
	
	List<JobSeeker> getAllname(String name);
	List<JobSeeker> getjobSeekerId(int id);
	List<JobSeeker> gettc(String name);
}
