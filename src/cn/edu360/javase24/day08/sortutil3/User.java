package cn.edu360.javase24.day08.sortutil3;

//
public class User implements Comparable<User>{
	
	// id ,name ,age ,salary
	private String id;
	private String name;
	private int age;
	private float salary;
	
	
	public User() {
		
	}


	public User(String id, String name, int age, float salary) {
		this.id = id;
		this.name = name;
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
		return this.id + ","+ this.name + "," + this.age + "," + this.salary;
	}
	
	//根据年龄比较器
	/**
	 * 自己的排序框架要调用的比大小方法
	 * @param other
	 * @return
	 */
	public int bijiao(User other){
		if(this.age>other.getAge()){
			return 1;
		}
		if(this.age==other.getAge()){
			return 0;
		}else {
			return -1;
		}
	}

	/**
	 * Collections框架要调用的比大小方法
	 */

	@Override
	public int compareTo(User o) {
		if(this.age>o.getAge()){
			return 1;
		}
		if(this.age==o.getAge()){
			return 0;
		}else {
			return -1;
		}
	}
	

}
