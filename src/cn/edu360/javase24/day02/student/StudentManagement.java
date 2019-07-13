package cn.edu360.javase24.day02.student;

import java.util.Scanner;

/**
 * 学生信息管理
 * 对象就是类的实例
 * @author Administrator
 *
 */
public class StudentManagement {
	public static void main(String[] args) {
		StudentInfo[] students = new StudentInfo[2];
		
		//接收用户从终端输入的学生信息 让用户一个学生的一个属性的输入
		Scanner sc = new Scanner(System.in);
		
		//接收第一个学生的信息
		StudentInfo stu1 = new StudentInfo();
		stu1.name = sc.nextLine();
		stu1.stuNbr = sc.nextLine();
		stu1.age = Integer.parseInt(sc.nextLine());
		stu1.score = Float.parseFloat(sc.nextLine());
		
		//接收第二个学生的信息
		StudentInfo stu2 = new StudentInfo();
		stu2.name = sc.nextLine();
		stu2.stuNbr = sc.nextLine();
		stu2.age = Integer.parseInt(sc.nextLine());
		stu2.score = Float.parseFloat(sc.nextLine());	
		
		
		//将学生信息存入数组中
		
		
		//根据分数倒叙排序
		if(stu1.score<stu2.score){
			students[0]=stu2;
			students[1]=stu1;
		}else {
			{
				students[0]=stu1;
				students[1]=stu2;
			}
		}
		
		
		//将排序后的结果打印出来
		System.out.println(students[0].name+":"+students[0].stuNbr+":"+students[0].age+":"+students[0].score);
		System.out.println(students[1].name+":"+students[1].stuNbr+":"+students[1].age+":"+students[1].score);
		
		
		
		
		
		
		
	}
}
