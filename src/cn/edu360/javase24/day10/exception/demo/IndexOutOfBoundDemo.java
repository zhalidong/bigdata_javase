package cn.edu360.javase24.day10.exception.demo;

import java.util.Scanner;

/**
 * 异常就是程序在运行过程中可能出现的不正常状况 这个状况可能导致程序无法继续运行
 * jvm在执行程序的过程中如果遇到这样的情况	就会将程序执行中止	同时打印出异常状况的相关信息  
 * @author Administrator
 *
 */
public class IndexOutOfBoundDemo {
	//把异常抛给jvm   有异常 后面代码不会执行
	public static void main(String[] args)  {
		
//		int[] arr = new int[5];
//		arr[6]=10;
		
		int[] arr = new int[]{2,3,4,5,6};
		ListTool tool = new ListTool();
//		tool.getIntFromArr(arr, 6);
		while(true){
		Scanner sc = new Scanner(System.in);
		String index = sc.nextLine();
		//把字符串index转换成int类型
		
		try{
		int num = tool.getIntFromArr(arr, index);
		System.out.println(num);
		}catch(Exception e){
			//
			System.out.println("妈呀 踩雷了 但是没事");
		}
		
		//程序后续有代码
		System.out.println("后续代码");
		}
		
	}
	
}
