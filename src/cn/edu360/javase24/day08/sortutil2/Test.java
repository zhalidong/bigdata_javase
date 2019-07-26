package cn.edu360.javase24.day08.sortutil2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


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
		
		
		//构造一个排序工具
		SortUtil<User> sortUtil = new SortUtil<>();
		sortUtil.sort(ulist, new AgeBijiaoqi());
		
		//匿名内部类
		sortUtil.sort(ulist, new BijiaoQi<User>(){

			@Override
			public boolean bijiao(User O1, User O2) {
				if(O1.getSalary()>O2.getSalary()){
					return true;
				}
				return false;
			}
		}		);
		
		
		/**
		 * 对list排序有现成的工具Collections可用
		 */
		Collections.sort(ulist,new Comparator<User>() {
			/**
			 * 返回正数	表示o1	>	o2
			 * 返回负数	表示o1	<	o2
			 * 返回0		表示o1	=	o2
			 * 
			 */
			@Override
			public int compare(User o1, User o2) {
				float res= o1.getSalary() - o2.getSalary();
				if (res>0) {
					return 1;
				}
				return -1;
			}
			
		});
		
		for(User u:ulist){
			System.out.println(u);
		}
	}
	
}
