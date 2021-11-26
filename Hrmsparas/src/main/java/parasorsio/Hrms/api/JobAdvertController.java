package parasorsio.Hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import parasorsio.Hrms.business.abstracts.JobAdvertService;
import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.entities.concretes.JobAdvert;

@RestController
@RequestMapping("/api/job_advert_controllers/")
public class JobAdvertController {

	private JobAdvertService jobAdvertService;

	@Autowired
	public JobAdvertController(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
	}

	@GetMapping("getAll")
	public DataResult<List<JobAdvert>> getAll() {
		return this.jobAdvertService.getAll();

	}

	@PostMapping("add")
	public Result add(@RequestBody JobAdvert jobAdvert) {
		return this.jobAdvertService.add(jobAdvert);
	}

	@GetMapping("getByJobAdvertName")
	public DataResult<JobAdvert> getByJobAdvertName(@RequestParam String jobAdvertName) {
		return this.jobAdvertService.getByJobAdvertName(jobAdvertName);
	}

	@GetMapping("getByJobAdvertNameOrCategory")
	public DataResult<JobAdvert>
	getByJobAdvertNameOrCategory(@RequestParam("jobAdvertName") String jobAdvertName,@RequestParam("categoryId") int categoryId) {
		return this.jobAdvertService.getByJobAdvertNameOrCategoryId(jobAdvertName, categoryId);
	}

	@GetMapping("getByJobAdvertNameContains")
	public DataResult<List<JobAdvert>> getByJobAdvertNameContains(@RequestParam String jobAdvertName){
		return this.jobAdvertService.getByJobAdvertNameContains(jobAdvertName);
	}
	@GetMapping("getAllByPage")
	public DataResult<List<JobAdvert>> getAll(int pageNo,int pageSize){
		
		return this.jobAdvertService.getAll(pageNo, pageSize);
	}
	@GetMapping("getAllASC")
	public DataResult<List<JobAdvert>> getAllSorted(){
		
		return this.jobAdvertService.getAllSorted();
	}
}
