package cn.edu360.javase24.day07.interfacedemo;

public class XXServiceTest {
	
	public static void main(String[] args) {
		//接口类型的变量	面向接口编程
		XXService xxService= new XXServiceImpl() ;
		//接收用户的操作1		就要调用业务中的step1方法
		String step1 = xxService.step1();
		System.out.println(step1);
		
	}
	
}
