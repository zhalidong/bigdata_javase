package cn.edu360.javase24.day07.construct;
/**
 * jvm在为一个类构造对象时 	所进行的工作
 * 1	首先执行静态代码  如果有多份静态代码 从上往下顺序执行
 * 2	然后执行普通代码块
 * 3	然后执行构造方法
 * 
 * @author Administrator
 *
 */
public class OrderDatabase {
	
	public static String orderVersion;
	
	static{
		System.out.println("静态代码块执行了...");
		System.out.println(orderVersion);
		orderVersion="1000";
		System.out.println(orderVersion);
		
	}
		
	{
		System.out.println("普通代码块执行了...");
	}
	
	public OrderDatabase(){
		
		System.out.println("空参构造函数运行了...");
		orderVersion="2000";
	}
	
}
