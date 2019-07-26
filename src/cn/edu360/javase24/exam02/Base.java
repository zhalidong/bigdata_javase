package cn.edu360.javase24.exam02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class Base {
	public static void main(String[] args) {
		//1、定义一个数组，存放整数，并将数组按脚标顺序和反序分别遍历打印；
		int[] num = new int[]{2,3,7,5,4,8};		
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}
		
		for(int i=num.length-1;i>-1;i--){
			System.out.println(num[i]);
		}
		
		//2、定义一个ArrayList，存放整数，并将这个list按脚标顺序和反序分别遍历打印；
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(7);
		list.add(5);
		list.add(4);
		list.add(8);
		
		for(int tmp:list){
			System.out.println(list);
		}
		
		for(int i =list.size()-1;i>-1;i--){
			System.out.println(list.get(i));
		}
		
		//3、定义一个Set集合，存放String数据，并添加5个字符串到这个set集合汇总，然后将这个set集合遍历打印
		HashSet<String> set = new HashSet<>();
		set.add("2");
		set.add("3");
		set.add("7");
		set.add("5");
		set.add("4");
		set.add("8");
		
		for(String tmp:set){
			System.out.println(set);
		}
		
	/*	4、定义一个HashMap集合，其中key存放String，value存放Integer
		并添加5对key-value到map集合中，比如["a",1]  ["b",3] ["c",2] ["d",6] ["e",7]
		然后将这个map集合遍历打印（只打印value为奇数的key-value数据）
	*/
		HashMap<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 3);
		map.put("c", 2);
		map.put("d", 6);
		map.put("e", 7);
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> tmp:entrySet){
			if(tmp.getValue()%2!=0){
				System.out.println(tmp.getKey()+":"+tmp.getValue());
			}
		}
	}
}
