package cn.edu360.javase24.day04.list.demo;

import java.util.ArrayList;

/**
 * 测试ArrayList用法
 * <>中填入的是泛型 要装入的数据类型
 * ArrayList 是一种数据类型 可以装任意多个具体的数据 长度可变
 * 重要功能
 * add()
 * get()
 * remove()
 * @author Administrator
 *
 */
public class ListDemo {
	public static void main(String[] args) {
		//创建一个用来装整数数据的Arraylist对象
		ArrayList<Integer> xx=new ArrayList<Integer>();
		
		//向Arraylist中添加数据
		xx.add(1);
		xx.add(3);
		xx.add(5);
		
		//从arraylist读取数据
		int a = xx.get(2);
		System.out.println(a);
		
		//将整个arraylist打印出来 遍历
		for(int i=0;i<xx.size();i++){
			System.out.println(xx.get(i));
		}
		
		//从arraylist移除数据
		xx.remove(1);
		
		
		
	}
}
