package cn.edu360.javase24.day07.interfacedemo2;
/**
 * 业务层的接口
 * 定义了了两个方法	
 * @author Administrator
 *
 */
public interface UserService {
	
	public boolean login(String name,String pwd);
	/**
	 * 业务层返回状态
	 * 密码不一致  返回1
	 * 用户名已存在 返回2
	 * 注册成功		返回3
	 * @param name
	 * @param pwd1
	 * @param pwd2
	 * @return
	 */
	public String regist(String name,String pwd1,String pwd2);
	
}



