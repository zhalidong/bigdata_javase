package cn.edu360.javase24.day07.interfacedemo2;
/**
 * 业务层
 * @author Administrator
 *
 */
public class UserServiceImpl implements UserService{
	UserDao userDao = new UserDaoImpl();	
	
	@Override
	public boolean login(String name, String pwd) {
		//调用dao层功能查询该用户名是否存在	传一个用户名  返回一个用户对象
		User user = userDao.findUserByName(name);
		//空指针判断
		if (user==null) {
			return false;
		}
		if (user.getPassword().equals(pwd)) {
			return true;
		}
		return false;
	}

	@Override
	public String regist(String name, String pwd1, String pwd2) {
		
		
		
		
		//调用dao层功能去检查该用户名是否存在
		boolean exist = userDao.checkUserIfExsit(name);
		//如果用户名已存在		则直接返回2
		if(exist){
			return "2";
		}
		
		//将用户信息存储到数据库
		User u = new User();
		u.set(name, pwd1);
		userDao.addUser(u);
		
		
		return "3";
	}
	
}
