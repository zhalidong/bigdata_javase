package cn.edu360.javase24.day07.interfacedemo2.dao;

import java.time.Year;

import org.junit.Test;

import cn.edu360.javase24.day07.interfacedemo2.UserDatabase;
import cn.edu360.javase24.day07.interfacedemo2.pojo.User;
/**
 * 有一个框架叫junit
 * 可以帮我们调用各种测试方法
 * 我们可以不用写main方法来测试
 * @author Administrator
 *
 */
public class UserDaoImpJunitlTest {
	
	@Test		//要运行哪个测试方法 	就在这个方法上添加@Test注解 	
	public  void testFind() {
		
		User u = new User();
		u.set("zhangsan", "123");
		UserDatabase.userMap.put(u.getUserName(), u);
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		User xx = userDaoImpl.findUserByName("zhangsan");
		System.out.println(xx);
	}
	
}
