package parasorsio.Hrms.business.abstracts;

import java.util.List;

import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.entities.concretes.SocialMedia;

public interface SocialMediaService {

	Result add(SocialMedia socialMedia);

	Result update(SocialMedia socialMedia);

	Result delete(int id);

	DataResult<SocialMedia> getById(int id);

	DataResult<SocialMedia> getBySocialMediaName(String socialMediaName);

	DataResult<List<SocialMedia>> getAll();

	DataResult<List<SocialMedia>> getAll(int pageNo, int pageSize);

	DataResult<List<SocialMedia>> getAllSorted();

}
