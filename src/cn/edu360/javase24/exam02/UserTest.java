package cn.edu360.javase24.exam02;

import java.util.ArrayList;

import org.junit.Test;

/**
 * 
 * 3、将上述5个User对象存入一个ArrayList
   4、对上述ArrayList中的user对象进行排序（排序规则为：age大的排前面），并打印结果
   5、对上述ArrayList中的user对象进行排序（排序规则为：salary小的排前面），并打印结果
 * @author Administrator
 *
 */
public class UserTest {
	
	@Test
	public void test() {
		User u1 = new User("1", "张三", 18, 2000);
		User u2 = new User("2", "李四", 20, 3000);
		User u3 = new User("3", "王五", 19, 2500);
		User u4 = new User("4", "赵六", 19, 3600);
		User u5 = new User("5", "铁蛋", 20, 2800);
		
		
		ArrayList<User> list = new ArrayList<>();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		list.add(u5);
		
		for(int i=0;i<list.size()-1;i++){
			for(int j=0;j<list.size()-i-1;j++){
				User userj= list.get(j);
				User userj_1= list.get(j+1);
				
				if(userj.getAge()<userj_1.getAge()){
					list.set(j, userj_1);
					list.set(j+1, userj);
				}
			}
		}
		
		for(User u:list){
			System.out.println(u);
		}
		
	}
	
}
