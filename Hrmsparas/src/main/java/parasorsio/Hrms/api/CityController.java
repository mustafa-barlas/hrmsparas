package parasorsio.Hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import parasorsio.Hrms.business.abstracts.CityService;
import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.City;

@RequestMapping("/api/cities/")
@RestController
public class CityController {

	private CityService cityService;

	@Autowired
	public CityController(CityService cityService) {
		super();
		this.cityService = cityService;
	}

	@PostMapping("add")
	public Result add(@RequestBody City city) {

		return this.cityService.add(city);
	}

	@GetMapping("getAll")
	public DataResult<List<City>> getAll() {

		return this.cityService.getAll();
	}

	@PostMapping("update")
	public Result update(@RequestBody City city) {

		return this.cityService.update(city);

	}

	@PostMapping("delete")
	public Result delete(int id) {

		return this.cityService.delete(id);
	}

	@GetMapping("getByCity")
	public DataResult<City> getByCity(int city) {

		return this.cityService.getByCity(city);
	}

	@GetMapping("pageable")
	public DataResult<List<City>> getAll(int pageNo, int pageSize) {

		return this.cityService.getAll(pageNo, pageSize);
	}

	@GetMapping("getAllSorted")
	public DataResult<List<City>> getAllSorted() {

		return this.cityService.getAllSorted();
	}

}
