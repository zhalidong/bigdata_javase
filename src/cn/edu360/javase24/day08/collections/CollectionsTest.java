package cn.edu360.javase24.day08.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class CollectionsTest {
	
	public static void main(String[] args) {
		Product p1 = new Product("1","a",10,9);
		Product p2 = new Product("2","b",20,9);
		Product p3 = new Product("3","c",15,6);
		Product p4 = new Product("4","d",30,9);
		
		ArrayList<Product> plist = new ArrayList<>();
		
		/**
		 * 使用collections工具来排序
		 * 方式1	传专门的比较器给工具
		 * 本方式最通用 想按什么比就按什么比
		 * 
		 */
		Collections.sort(plist, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				if(o1.getPrice()>o2.getPrice()){
					return 1;
				}
				return -1;
			}
		});
		
		/**
		 * 方式二:不传专门的比较器给工具
		 * 前提是    list中的数据类型本身可比较(数据类型本身要实现一个接口Comparable)
		 * 然后就要实现其中的方法compareTo()
		 */
		ArrayList<User> ulist = new ArrayList<>();
		User u1 = new User("1", "a", 18, 2000);
		User u2 = new User("2", "b", 19, 3000);
		User u3 = new User("3", "c", 28, 1800);
		User u4 = new User("4", "d", 20, 2300);
		
		ulist.add(u1);
		ulist.add(u2);
		ulist.add(u3);
		ulist.add(u4);
		
		Collections.sort(ulist);
		
		
	}
	
}
