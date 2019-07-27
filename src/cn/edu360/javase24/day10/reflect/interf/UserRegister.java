package cn.edu360.javase24.day10.reflect.interf;

public interface UserRegister {

	public boolean checkIfExist(String name);
	public boolean registerUser(String name,String pwd1,String pwd2);
	
	
}
