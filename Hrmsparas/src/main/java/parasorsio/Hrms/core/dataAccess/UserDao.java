package parasorsio.Hrms.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
	User getByEmail(String email);
	
	

}
