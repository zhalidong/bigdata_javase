package cn.edu360.javase24.day08.sortutil1;

import java.util.ArrayList;

public class SortUtilTest {
	
	public static void main(String[] args) {
		User u1 = new User("u1", "嫦娥", 18, 1000.0f);
		User u2 = new User("u2", "吴刚", 18, 1200.0f);
		User u3 = new User("u3", "玉兔", 28, 1500.0f);
		User u4 = new User("u4", "八戒", 8, 1200.0f);
		
		ArrayList<User> uList = new ArrayList<>();
		uList.add(u1);
		uList.add(u2);
		uList.add(u3);
		uList.add(u4);
		//AgeBijiaoQi() 这个类时用户自己定义的比较规则 实现了接口
		SortUtil.sort(uList,new AgeBijiaoQi());
		
		SortUtil.sort(uList, new SalaryBijiaoQi());
		
		SortUtil.sort(uList, new AgeSalaryBijiaoQi());
		
		for(User u:uList){
			System.out.println(u);
		}
	}
}
