package cn.edu360.javase24.day10.reflect.demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
/**
 * 这就是一个面向接口的程序
 * 就是一个框架 调用两个实现类
 * 通过读取配置文件
 * @author Administrator
 *
 */
public class Test {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/a.txt")));
		HashMap<String, String> applicationContest = new HashMap<>();
		/**
		 * 解析配置文件，将所有的接口名及其相应的要调用的实现类名放入一个hashmap中
		 */
		String line="";
		while((line = br.readLine())!=null){
			//解析配置文件中的每一行
			String[] split = line.split(":");
			applicationContest.put(split[0], split[1]);
		}
		/**
		 * 先掉一下one two service的实现类的say方法
		 * 
		 */
		
		Class<?> forName1 = Class.forName(applicationContest.get("onetwoService"));
		OneTwoService newInstance1 = (OneTwoService)forName1.newInstance();
		newInstance1.say();
		
		/**
		 * 然后要调otherservice的实现类的eat方法
		 */
		Class<?> forName2 = Class.forName(applicationContest.get("otherService"));
		OtherService newInstance2 = (OtherService)forName2.newInstance();
		newInstance2.eat();
		
		
		
		
		
	}
	
}
