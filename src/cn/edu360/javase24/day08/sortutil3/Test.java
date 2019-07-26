package cn.edu360.javase24.day08.sortutil3;

import java.util.ArrayList;
import java.util.Collections;


public class Test {

	public static void main(String[] args) {
		ArrayList<User> ulist = new ArrayList<>();
		User u1 = new User("1", "a", 18, 2000);
		User u2 = new User("2", "b", 19, 3000);
		User u3 = new User("3", "c", 28, 1800);
		User u4 = new User("4", "d", 20, 2300);
		
		ulist.add(u1);
		ulist.add(u2);
		ulist.add(u3);
		ulist.add(u4);
		
		SortUtil3 sortutil = new SortUtil3();
		//使用User类中的排序方法 	我们的框架通过调用User的bijiao方法来比大小
		sortutil.sort(ulist);
		for(User u:ulist){
			System.out.println(u);
		}
		
		
		//jdk中现成的工具Collections也能进行排序
		//必须让类实现User implements Comparable<User>   这个接口
		//框架内部通过调用User的compareTo方法来比大小
		Collections.sort(ulist);
		
		
		
	}
	
}
