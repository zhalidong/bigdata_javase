package cn.edu360.javase24.day06.hashmapdemo;

import java.util.HashMap;
import java.util.Set;

import cn.edu360.javase24.day05.shop.Product;
/**
 * 练习
 * 找出hashmap中产品名称重复的数据	并打印出发生了重复的数据的id:
 * @author Administrator
 *
 */

public class HashMapTest2 {
	
	public static void main(String[] args) {
		//1.造几个product对象 放入一个hashmap中
		Product p1 = new Product("1", "香蕉", 20, 2);
		Product p2 = new Product("2", "橘子", 10, 2);
		Product p3 = new Product("3", "榴莲", 120, 2);
		Product p4 = new Product("4", "香蕉", 20, 2);
		Product p5 = new Product("5", "榴莲", 120, 2);
		Product p6 = new Product("6", "榴莲", 120, 2);
		
		HashMap<String, Product> pdtMap = new HashMap<>();
		pdtMap.put(p1.getProductId(),p1);
		pdtMap.put(p2.getProductId(),p2);
		pdtMap.put(p3.getProductId(),p3);
		pdtMap.put(p4.getProductId(),p4);
		pdtMap.put(p5.getProductId(),p5);
		pdtMap.put(p6.getProductId(),p6);
		
		
		/**
		 * 思路：从现在的hashmap中取出 "1","香蕉"  放入一个新的hashmap中 "香蕉" 作为key "1"作为value  依次遍历原来的hashmap如果新的hashmap中没有就插入
		 * 有的话就对新的hashmap中的value进行拼接后		"1"+"4" -> "1,4"
		 */
		
		//找出hashmap中产品名称重复的数据	并打印出发生了重复的数据的id:
		//1,4  --> 香蕉
		//遍历pdtMap 逐一取出里面的product对象	然后	构造一个新的hashmap
		//判断这个product对象的name在新的hashmap是否存在 	
		//如果不存在	则将这个product对象的name作为key,id作为value 放入一个新的hashmap中
		//如果已存在	则将之前的id拼上这个product的id作为value覆盖进去
		
		HashMap<String, String> newMap = new HashMap<>();
		
		
		//拿到所有hashmap中的key
		Set<String> keySet = pdtMap.keySet();
		for(String id:keySet){
			Product p = pdtMap.get(id);
			if(newMap.containsKey(p.getProductId())){
				String id_value = newMap.get(p.getProductId());	//从新map中取出已存在的产品id
				newMap.put(p.getProductName(), id_value+","+p.getProductId());//将新map中的产品id拼上这次从老map中取出的产品id
			}else {
				newMap.put(p.getProductName(), p.getProductId());
			}
		}
		
		//打印出来
		Set<String> set = newMap.keySet();
		for(String tmp:set){
			String ids = newMap.get(tmp);
			System.out.println(ids+"-->"+tmp);
			
		}
	}
	
}
