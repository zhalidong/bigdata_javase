package cn.edu360.javase24.day06.hashmapdemo;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		//构造一个hashmap对象
		HashMap<String, String> map1 = new HashMap<>();
		//往hashmap中添加数据	如果key重复		则会覆盖
		map1.put("1", "白百何");
		map1.put("1", "马蓉");
		
		//继续添加
		map1.put("2", "王宝强");
		map1.put("3", "黄渤");
		
		//获取map中的数据
		String s1 = map1.get("2");
		System.out.println(s1);
		
		//获取map中的长度
		int size = map1.size();
		System.out.println(size);
		
		//从map中移除数据
//		String remove = map1.remove("3");
		
		
		//可以利用map的contains功能判断指定的key 是否存在
		boolean b = map1.containsKey("3");
		System.out.println(b);
		
		
		
	}
	
}
