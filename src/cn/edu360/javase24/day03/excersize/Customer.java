package cn.edu360.javase24.day03.excersize;
/**
 * 
 * @author Administrator
 *用户可以在终端上输入如下信息

1,zhangsan,18,male,1383838388,北京

要求程序能接受用户输入的数据 并且将这些信息封装到3个对象中

然后求出着3个人的平均年龄 最大年龄
 */
public class Customer {
	String id;
	String name;
	int age;
	String sex;
	String phone;
	String addr;
	public Customer(String id, String name, int age, String sex, String phone, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
		this.addr = addr;
	}
	
	
}
