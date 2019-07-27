package cn.edu360.javase24.day10.reflect.menu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import cn.edu360.javase24.day10.reflect.interf.UserRegister;

public class Menu {
	
	public static void main(String[] args) throws Exception {
		//从约定的文件中读取service层实现类的类全名
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/a.txt")));
		String serviceClassName = br.readLine();
		System.out.println(serviceClassName);
		Class<?> forName = Class.forName(serviceClassName);//forname代表的是字符串所制定的类
		
		//根据类全名构造这个service实现类的实例
		UserRegister registerService = (UserRegister)forName.newInstance();
		
		
		
		UserRegister userRegister=null;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("1登录 2注册");
		while(flag){
			String select = sc.nextLine();
			
			switch (select) {
			case "1":
					
				break;
			
			case "2":	
				System.out.println("请输入账户");
				String name = sc.nextLine();
				System.out.println("请输入密码");
				String pwd1 = sc.nextLine();
				System.out.println("请再次输入密码");
				String pwd2 = sc.nextLine();
				boolean checkIfExist = userRegister.checkIfExist(name);
				if(checkIfExist){
					System.out.println("用户名已经存在");
					break;
				}
				
				
				
				break;
			
			}
			
			
		}
		
		
	}
	
}
