package cn.edu360.javase24.day06.hashmapdemo;

import java.util.HashMap;
import java.util.Set;

/**
 * 我给你一个字符串 "a,b,c,d,e,f,g,h,b,b,b,c,x,x,y,x,b"
 * 写一个程序统计出每一个字母出现的总次数，并将结果打印如下：
a,1
b,5
c,2
....
 * @author Administrator
 *
 */
public class 练习2 {
	
	public static void main(String[] args) {
		
		String str = "a,b,c,d,e,f,g,h,b,b,b,c,x,x,y,x,b";
		String[] words = str.split(",");
		
		HashMap<String, Integer> Map = new HashMap<>();
		
		
		for(String tmp:words){
			//判断map中是否有和数组中一样的字符
			if(Map.containsKey(tmp)){
				//获取map中value 
				Integer value = Map.get(tmp);
				Map.put(tmp, value+1);
				
			}else {
				Map.put(tmp, 1);
			}
		}
		
		/**
		 * 遍历hashmap	打印数据
		 * 
		 */
		//先取出所有的key
		Set<String> keySet = Map.keySet();
		// 然后遍历一个一个的key，去map中取value
		for(String tmp:keySet){
				Integer count = Map.get(tmp);
				System.out.println(tmp+","+count);
		}
		
		
	}
	
}
