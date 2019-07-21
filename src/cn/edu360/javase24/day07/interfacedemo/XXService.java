package cn.edu360.javase24.day07.interfacedemo;

import java.util.HashMap;
/**
 * 接口中只进行方法的定义	不能有方法实现
 * 那么  这个接口类型是不能被实例化
 * 接口不能new
 * 接口的作用:就是用来业务实现类和调用者之间定义一个功能规范
 * 
 * @author Administrator
 *
 */
public interface XXService {

	public String step1();
	
	public void step(String id);
	
	public HashMap<String, Integer> step3(int a);
	
	
}
