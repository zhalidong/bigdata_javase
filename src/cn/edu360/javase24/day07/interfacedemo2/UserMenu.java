package cn.edu360.javase24.day07.interfacedemo2;

import java.util.Scanner;

//界面层
public class UserMenu {
	
	public static void main(String[] args) {
		//定义一个业务组件变量	用它的接口类型引用
		UserService userManage=new UserServiceImpl();		//接口变量
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag){
		
		System.out.println("1 登录 2 注册 3 退出");
		String nextLine = sc.nextLine();
		
		switch (nextLine) {
		case "1":
			System.out.println("请输入账号:");
			String username = sc.nextLine();
			System.out.println("请输入密码:");
			String pwd = sc.nextLine();
			
			//调用业务逻辑组件的登录方法
			boolean login = userManage.login(username, pwd);
			if(login){
				System.out.println("恭喜你  登录成功");
			}else {
				System.out.println("登录失败");
			}
			break;

		case "2":
			System.out.println("请输入用户名");
			String name = sc.nextLine();
			System.out.println("请输入密码");
			String pwd1 = sc.nextLine();
			System.out.println("请再次确认密码");
			String pwd2 = sc.nextLine();
			
			//调用业务逻辑组件的注册方法
			String res = userManage.regist(name, pwd1, pwd2);
			switch (res) {
			case "1":
				System.out.println("密码输入的不一致");
				
				break;

			case "2":
				System.out.println("账号已经被使用");
				break;
			case "3":
				System.out.println("注册成功");
				break;
			default:
				break;
			}
		case "3":
			System.out.println("bye...");
			flag = false;
			break;
			}
		}
	}
}
