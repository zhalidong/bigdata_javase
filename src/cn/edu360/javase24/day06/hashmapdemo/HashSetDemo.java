package cn.edu360.javase24.day06.hashmapdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import cn.edu360.javase24.day05.shop.Product;

/**
 * hashset是一个集合数据类型
 * 一个具体的hashset中可以装入多个数据		顺序是无序的
 * hashset中的数据不能重复
 * hashset中数据存储时无序的
 * @author Administrator
 *
 */
public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<String> set1 = new HashSet<>();
		set1.add("白百何");
		set1.add("马蓉");
		set1.add("马蓉");
		set1.add("杨贵妃");
		set1.add("潘金莲");
		set1.add("西施");		
		
		//获取set长度
		int size = set1.size();
		
		//移除元素
		set1.remove("马蓉");
		
		//遍历set集合
		/**
		 * 外部不知道该如何去一个数据存储结构中取数据时 
		 * 该数据结构一般会提供一个迭代器来为用户取数据
		 * hasNext() 判断是否还要数据 	同时将数据游标后移
		 * next()	取当前位置的数据
		 */
		//遍历set集合 用迭代器来去数据
		Iterator<String> it = set1.iterator();
		while(it.hasNext()){
			String next = it.next();
			System.out.println(next);
		}
		
		//增强for循环：内部封装了迭代器的使用
		for(String tmp:set1){
			System.out.println(tmp);
		}
		
		//数组也可以用增强for循环来遍历
		int[] arr = new int[]{3,5,7,9,2};
		for(int x:arr){
			System.out.println(x);
		}
		
		//arraylist也可以用增强for循环来遍历
		ArrayList<Product> pdts = new ArrayList<>();
		pdts.add(new Product("1", "肥皂", 12.45f, 2));
		pdts.add(new Product("2", "香皂", 12.45f, 3));
		pdts.add(new Product("3", "洗衣粉", 12.45f, 1));
		
		for(Product p:pdts){
			System.out.println(p);
		}		
		
		
	}
	
}
