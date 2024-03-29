package cn.edu360.javase24.day07.interfacedemo2.dao;

import cn.edu360.javase24.day07.interfacedemo2.UserDatabase;
import cn.edu360.javase24.day07.interfacedemo2.pojo.User;

public class UserDaoImpl implements UserDao{
	/**
	 * 根据一个用户名到数据库中查找该用户
	 */
	@Override
	public User findUserByName(String userName) {
		User user = UserDatabase.userMap.get(userName);
		
		return user;
	}
	/**
	 * 检查数据库中是否已存在该用户名
	 */
	@Override
	public boolean checkUserIfExsit(String userName) {
		boolean containsKey = UserDatabase.userMap.containsKey(userName);
		return containsKey;
	}
	/**
	 * 将传入的user对象存入数据库
	 */
	@Override
	public void addUser(User u) {
		UserDatabase.userMap.put(u.getUserName(),u);
	}

}
