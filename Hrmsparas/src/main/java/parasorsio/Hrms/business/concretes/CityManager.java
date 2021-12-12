package parasorsio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import parasorsio.Hrms.business.abstracts.CityService;
import parasorsio.Hrms.core.utilities.Result.DataResult;
import parasorsio.Hrms.core.utilities.Result.Result;
import parasorsio.Hrms.core.utilities.Result.SuccessDataResult;
import parasorsio.Hrms.core.utilities.Result.SuccessResult;
import parasorsio.Hrms.dataAccess.abstracts.CityDao;
import parasorsio.Hrms.entities.concretes.City;

@Service
public class CityManager implements CityService {

	private CityDao cityDao;

	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public Result add(City city) {

		this.cityDao.save(city);
		return new SuccessResult();

	}

	@Override
	public Result update(City city) {
		this.cityDao.save(city);
		return new SuccessResult();
	}

	@Override
	public Result delete(int id) {

		return new SuccessDataResult<City>(this.cityDao.getByCityId(id));
	}

	@Override
	public DataResult<City> getByCity(int city) {

		return new SuccessDataResult<City>(this.cityDao.getByCityId(city));
	}

	@Override
	public DataResult<List<City>> getAll() {

		return new SuccessDataResult<List<City>>(this.cityDao.findAll());
	}

	@Override
	public DataResult<List<City>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);

		return new SuccessDataResult<List<City>>(this.cityDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<City>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.ASC, "cityName");
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(sort));
	}

}
