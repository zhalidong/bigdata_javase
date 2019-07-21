package cn.edu360.javase24.day07.interfacedemo2;

import java.util.HashMap;

import cn.edu360.javase24.day07.interfacedemo2.pojo.User;

public class UserDatabase {
	
	public static HashMap<String, User> userMap=new HashMap<>();
	/**
	 * 此类在被jvm加载时	静态代码块就会本执行
	 */
	static{
		User u1 = new User();
		u1.set("abc", "123");
		
		userMap.put(u1.getUserName(),u1);
		
		
	}
	
	
}
