package cn.edu360.javase24.day14.reflect;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		
		/*
		 * 反射的方式构造对象和调用方法
		 */
//		String type="cn.edu360.javase24.day14.reflect.LoginServiceImpl";
//		String func="say";
//		String paramType="java.lang.String";
		
		
		/*
		 * 通过加载配置文件来换取所有调的类名和方法及方法参数类型
		 */
		Properties props = new Properties();
		//自动加载项目工程下的properties配置文件使用相对路径
		props.load(ReflectDemo.class.getClassLoader().getResourceAsStream("xx.properties"));
		
		String type = props.getProperty("type");
		String func = props.getProperty("func");
		String paramType = props.getProperty("paramType");
		
		
		//根据类名和方法名 方法参数类型  来用反射的方法构造对象 并调用方法
		Class<?> forName = Class.forName(type);
		Object instance = forName.newInstance();
		
		Method method = forName.getMethod(func, Class.forName(paramType));
		
		method.invoke(instance, "铁蛋");
		
		
	}
	
}
