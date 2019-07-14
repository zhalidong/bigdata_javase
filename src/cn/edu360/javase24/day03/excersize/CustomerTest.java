package cn.edu360.javase24.day03.excersize;

import java.util.Scanner;

/**
 * 要求程序能接受用户输入的数据 并且将这些信息封装到3个对象中

然后求出着3个人的平均年龄 最大年龄
 * @author Administrator
 *
 */
public class CustomerTest {
	public static void main(String[] args) {
		
		//接收用户从终端输入的信息
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第1个客户的信息");
		String line1 = sc.nextLine();			//  line1 代表  整行数据  1,zhangsan,18,male,1383838388,北京
		//字符串切割
		String[] words1 = line1.split(",");
		
		
		System.out.println("请输入第2个客户的信息");
		String line2 = sc.nextLine();
		String[] words2 = line2.split(",");
		
		System.out.println("请输入第3个客户的信息");
		String line3 = sc.nextLine();
		String[] words3 = line2.split(",");
		
		//构造3个对象
		Customer c1 = new Customer(words1[0], words1[1], Integer.parseInt(words1[2]), words1[3], words1[4], words1[5]);
		Customer c2 = new Customer(words2[0], words2[1], Integer.parseInt(words2[2]), words2[3], words2[4], words2[5]);
		Customer c3 = new Customer(words3[0], words3[1], Integer.parseInt(words3[2]), words3[3], words3[4], words3[5]);
		//平均年龄
		int sum=c1.age+c2.age+c3.age;
		float result = (float)sum/3;
		
		//把对象放入一个数组中
		Customer[] cs = new Customer[]{c1,c2,c3};
		
		//年龄最大值
		int tmp = cs[0].age;
		for(int i=0;i<3;i++){
			if (cs[i].age>tmp) {
				tmp=cs[i].age;
			}
		}
		
		System.out.println("平均年龄:"+result+"最大年龄为:"+tmp);
		
		
		
		
		
	}
}
