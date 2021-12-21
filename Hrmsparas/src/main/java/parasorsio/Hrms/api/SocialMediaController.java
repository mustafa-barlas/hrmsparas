package parasorsio.Hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import parasorsio.Hrms.business.abstracts.SocialMediaService;
import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.SocialMedia;

@RestController
@RequestMapping("/api/social_media/")
public class SocialMediaController {

	private SocialMediaService socialMediaService;

	@Autowired
	public SocialMediaController(SocialMediaService socialMediaService) {
		super();
		this.socialMediaService = socialMediaService;
	}

	@PostMapping("add")
	public Result add(SocialMedia socialMedia) {

		return this.socialMediaService.add(socialMedia);
	}

	@PostMapping("update")
	public Result update(SocialMedia socialMedia) {

		return this.socialMediaService.update(socialMedia);
	}

	@PostMapping("delete")
	public Result delete(int id) {

		return this.socialMediaService.delete(id);
	}

	@GetMapping("socialMediaName")
	public DataResult<SocialMedia> getBySocialMediaName(String socialMediaName) {

		return this.socialMediaService.getBySocialMediaName(socialMediaName);
	}

	@GetMapping("getAll")
	public DataResult<List<SocialMedia>> getAll() {

		return this.socialMediaService.getAll();
	}

	@GetMapping("pageable")
	public DataResult<List<SocialMedia>> getAll(int pageNo, int pageSize) {

		return this.socialMediaService.getAll(pageNo, pageSize);
	}

	@GetMapping("getAllSorted")
	public DataResult<List<SocialMedia>> getAllSorted() {

		return this.socialMediaService.getAllSorted();
	}
}
