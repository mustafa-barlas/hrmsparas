package parasorsio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {

	City getByCityId(int cityId);

}
