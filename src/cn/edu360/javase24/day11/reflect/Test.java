package cn.edu360.javase24.day11.reflect;

import java.lang.reflect.Method;
/**
 * 反射机制的补充 如何使用字符串信息来指定要调用的方法
 * 字符串指定要调用的方法名
 * @author Administrator
 *
 */
public class Test {
	
	public static void main(String[] args) throws Exception {
		String classname="cn.edu360.javase24.day11.reflect.Person";
		String methodName="say";
		Class<?> forName=Class.forName(classname);
		Person p = (Person)forName.newInstance();
		
		//从forName这个class模板中获取指定的方法
		Method method = forName.getMethod(methodName);
//		Method method2 = forName.getMethod("eat", String.class);
		
		//将method在对象上执行
		Object invoke = method.invoke(p);
		System.out.println(invoke);
		
		
		
	}
	
}
