package parasorsio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.entities.concretes.JobAdvert;

public interface Category extends JpaRepository<Category, Integer>{

	

	JobAdvert getByJobAdvertNameAndCategory_CategoryId(String jobAdvertName, int categoryId);

	List<JobAdvert> getByCategory_CategoryIdIn(List<Integer> category);

}
