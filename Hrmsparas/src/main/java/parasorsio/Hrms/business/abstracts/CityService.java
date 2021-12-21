package parasorsio.Hrms.business.abstracts;

import java.util.List;

import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.entities.concretes.City;

public interface CityService {

	Result add(City city);

	Result update(City city);

	Result delete(int id);

	DataResult<City> getByCity(int city);

	DataResult<List<City>> getAll();

	DataResult<List<City>> getAll(int pageNo, int pageSize);

	DataResult<List<City>> getAllSorted();

}
