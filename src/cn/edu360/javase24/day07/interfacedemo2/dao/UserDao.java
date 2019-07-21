package cn.edu360.javase24.day07.interfacedemo2.dao;

import cn.edu360.javase24.day07.interfacedemo2.pojo.User;

public interface UserDao {
	
	public User findUserByName(String userName);
	public boolean checkUserIfExsit(String userName);
	public void addUser(User u);
}
