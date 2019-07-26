package cn.edu360.javase24.exam02;
/**
 * 3、将上述5个User对象存入一个ArrayList
   4、对上述ArrayList中的user对象进行排序（排序规则为：age大的排前面），并打印结果
   5、对上述ArrayList中的user对象进行排序（排序规则为：salary小的排前面），并打印结果

 * @author Administrator
 *
 */
public class User {
	//	id ,name ,age ,salary
	private String id;
	private String name;
	private int age;
	private float salary;
	
	public User(){}
	
	public User(String id, String name, int age, float salary) {
		super();
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
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
