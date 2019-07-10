package cn.edu360.javase24.day02.array;

import java.util.Scanner;

/**
 * 计算多门成绩的总分，平均分
 * @author Administrator
 *
 */
public class ArrayDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩");
		String line = sc.nextLine();
		
		float score1 = Float.parseFloat(line);
		
		System.out.println("请输入成绩");
		line=sc.nextLine();		//重新赋值给line 
		float score2 = Float.parseFloat(line);

		System.out.println("请输入成绩");
		line=sc.nextLine();		//重新赋值给line 
		float score3 = Float.parseFloat(line);

		System.out.println("总分为:"+score1+score2+score3);	//变成字符串拼接了
		System.out.println("平均为:"+(score1+score2+score3)/5);
		
	}
}
