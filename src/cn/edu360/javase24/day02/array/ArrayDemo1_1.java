package cn.edu360.javase24.day02.array;

import java.util.Scanner;

/**数组:可以用力装一组数据的变量
 * 定义数组  float[] arr = new float[10];	可以装10个float
 * 计算多门成绩的总分，平均分
 * @author Administrator
 *
 */
public class ArrayDemo1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//数组变量定义 下面的语句定义了一个用来装float数据的数组  长度为5
		float[] scoreArr=new float[5];
		for(int i=0;i<5;i++){
			System.out.println("请输入成绩");
			String line = sc.nextLine();
			
			//将一个数据装入数组中指定的第几个索引
			scoreArr[i]=Float.parseFloat(line);
		}
		
		//计算总成绩
		float sum=0;
		for(int i=0;i<5;i++){
			sum+=scoreArr[i];
		}
		System.out.println("总成绩为:"+sum);
		System.out.println("平均成绩为:"+sum/5);
		
		
	}
}
