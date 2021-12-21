package parasorsio.Hrms.business.abstracts;

import java.util.List;

import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {

	Result add(JobSeeker jobSeeker);

	Result update(JobSeeker jobSeeker);

	Result delete(int id);

	DataResult<JobSeeker> getById(int id);

	DataResult<JobSeeker> getByCityId(int cityId);

	DataResult<JobSeeker> getByCoverLetterId(int coverLetterId);

	DataResult<JobSeeker> getByEducationId(int educationInformationId);

	DataResult<JobSeeker> getByLanguageId(int foreignLanguageId);

	DataResult<JobSeeker> getBySkillId(int skillId);

	DataResult<JobSeeker> getBySocialMediaId(int socialMediaId);

	DataResult<JobSeeker> getByWorkExperienceId(int workExperienceId);

	DataResult<List<JobSeeker>> getByJobSeekerNameAndJobSeekerSurname(String jobSeekerName, String jobSeekerSurname);

	DataResult<List<JobSeeker>> getAll();

	DataResult<List<JobSeeker>> getAll(int pageNo, int pageSize);

	DataResult<List<JobSeeker>> getAllSorted();

	DataResult<List<JobSeeker>> getByJobSeekerNameContains(String jobSeekerName);

	DataResult<List<JobSeeker>> getByJobSeekerNameStartsWith(String jobSeekerName);

}
