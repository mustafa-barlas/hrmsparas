package parasorsio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import parasorsio.Hrms.business.abstracts.SocialMediaService;
import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.core.utilities.result.SuccessDataResult;
import parasorsio.Hrms.core.utilities.result.SuccessResult;
import parasorsio.Hrms.dataAccess.abstracts.SocialMediaDao;
import parasorsio.Hrms.entities.concretes.SocialMedia;

@Service

public class SocialMediaManager implements SocialMediaService {

	private SocialMediaDao socialMediaDao;

	@Autowired
	public SocialMediaManager(SocialMediaDao socialMediaDao) {
		super();
		this.socialMediaDao = socialMediaDao;
	}

	@Override
	public Result add(SocialMedia socialMedia) {
		this.socialMediaDao.save(socialMedia);
		return new SuccessResult();
	}

	@Override
	public Result update(SocialMedia socialMedia) {
		this.socialMediaDao.save(socialMedia);
		return new SuccessResult();
	}

	@Override
	public Result delete(int id) {
		this.socialMediaDao.deleteById(id);
		return new SuccessResult();
	}

	@Override
	public DataResult<SocialMedia> getById(int id) {

		return new SuccessDataResult<SocialMedia>(this.socialMediaDao.getBySocialMediaId(id));
	}

	@Override
	public DataResult<SocialMedia> getBySocialMediaName(String socialMediaName) {

		return new SuccessDataResult<SocialMedia>(this.socialMediaDao.getBySocialMediaName(socialMediaName));
	}

	@Override
	public DataResult<List<SocialMedia>> getAll() {
		return new SuccessDataResult<List<SocialMedia>>(this.socialMediaDao.findAll());
	}

	@Override
	public DataResult<List<SocialMedia>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
		return new SuccessDataResult<List<SocialMedia>>(this.socialMediaDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<SocialMedia>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.ASC, "socialMediaName");
		return new SuccessDataResult<List<SocialMedia>>(this.socialMediaDao.findAll(sort));
	}

}
