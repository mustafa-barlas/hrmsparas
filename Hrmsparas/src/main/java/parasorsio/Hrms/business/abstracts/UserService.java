package parasorsio.Hrms.business.abstracts;

import parasorsio.Hrms.core.entities.User;
import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.Result;

public interface UserService {

	Result add(User user);

	DataResult<User> getByEmail(String email);

}
