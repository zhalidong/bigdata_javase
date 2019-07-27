package cn.edu360.javase24.day10.exception.demo;

public class DivideZeroExceptionDemo {
	
	public static void main(String[] args) {
		int a =5;
		int b =0;
		try{
		int c=a/b;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		//这行代码会被执行
		System.out.println("后续代码");
		
		
	}
	
}
