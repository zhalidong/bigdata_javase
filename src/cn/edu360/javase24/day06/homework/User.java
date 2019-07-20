package cn.edu360.javase24.day06.homework;
/**
 * 1、定义一个User类，包含属性： id,name,password,phone,age,薪水
要求：所有属性为private
 * @author Administrator
 *
 */
public class User {

	private String id;
	private String name;
	private String password;
	private String phone;
	private int age;
	private float salary;
	
	public User(){}
	
	public User(String id, String name, String password, String phone, int age,
			float salary) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.age = age;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password
				+ ", phone=" + phone + ", age=" + age + ", salary=" + salary
				+ "]";
	}
	
	
	
}
