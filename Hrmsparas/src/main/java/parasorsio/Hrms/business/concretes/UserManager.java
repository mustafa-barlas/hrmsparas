package parasorsio.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import parasorsio.Hrms.business.abstracts.UserService;
import parasorsio.Hrms.core.dataAccess.UserDao;
import parasorsio.Hrms.core.entities.User;
import parasorsio.Hrms.core.utilities.result.DataResult;
import parasorsio.Hrms.core.utilities.result.ErrorDataResult;
import parasorsio.Hrms.core.utilities.result.Result;
import parasorsio.Hrms.core.utilities.result.SuccessResult;

@Service
public class UserManager implements UserService {

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("kulanıcı eklendi");

	}

	@Override
	public DataResult<User> getByEmail(String email) {

		return new ErrorDataResult<User>(this.userDao.getByEmail(email), "kulanıcı bulundu");
	}

}
