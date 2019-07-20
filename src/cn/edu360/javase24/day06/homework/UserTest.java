package cn.edu360.javase24.day06.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 2、写一个程序,用题1的User类，构造4个user对象
 * @author Administrator
 *
 */
public class UserTest {

	public static void main(String[] args) {
		
		User u1 = new User("1", "张三1", "111","1384848484" , 18, 1800);
		User u2 = new User("2", "张三2", "111","1384848484" , 18, 1800);
		User u3 = new User("3", "张三3", "111","1384848484" , 18, 1800);
		User u4 = new User("4", "张三4", "111","1384848484" , 18, 1800);
		
		//3、将题2中的4个user对象存入一个数组，然后再存入一个Arraylist，再存入一个HashSet，再存入一个HashMap
		
		
		//放入数组中
		User[] userArray = new User[]{u1,u2,u3,u4};
		
		//放入list
		ArrayList<User> userList = new ArrayList<>();
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		
		
		//放入hashset
		HashSet<User> userSet = new HashSet<>();
		userSet.add(u1);
		userSet.add(u2);
		userSet.add(u3);
		userSet.add(u4);
		
		
		//放入hashmap
		HashMap<String, User> userMap = new HashMap<>();
		userMap.put(u1.getId(), u1);
		userMap.put(u2.getId(), u2);
		userMap.put(u3.getId(), u3);
		userMap.put(u4.getId(), u4);
		
		//4、将题3中的list  、 set、  map  分别遍历打印所有user数据
		for(User u:userArray){
			System.out.println(u);
		}
		for(User u:userList){
			System.out.println(u);
		}
		for(User u:userSet){
			System.out.println(u);
		}
		System.out.println("--------------------");
		
		//遍历hashmap 先拿到所有的key
		Set<String> set = userMap.keySet();
		for(String str:set){
			System.out.println(userMap.get(str));
		}
		
		//遍历hashmap的另一种方法 entrySet 代表一行数据
		Set<Entry<String, User>> entrySet = userMap.entrySet();
		for(Entry<String, User> ent:entrySet){
			System.out.println(ent.getKey()+":"+ent.getValue());
		}
		
		//5、分别从题3的list中找出年龄最大的user对象，
		User u_list = userList.get(0);		//基准值
		for(int i=1;i<userList.size();i++){
			if(userList.get(i).getAge()>u_list.getAge()){
				u_list=userList.get(i);
			}
		}
		
		System.out.println("年龄最大的用户："+u_list);
		
		//从set中找出薪水最高的user对象
		//由于从set集合中无法取出一个数据 	所以使用了它的迭代器工具
		Iterator<User> it = userSet.iterator();
		User uset = it.next();		//基准值
		
		for(User u_set:userSet){
			if(u_set.getSalary()>uset.getSalary()){
				uset=u_set;
			}
		}
		
		System.out.println("薪水最高的用户:"+uset);
		
		//从map中找出age最小的user对象
		Set<String> keySet2 = userMap.keySet();
		//由于从set集合中无法取出一个数据 	所以使用了它的迭代器工具
		Iterator<String> iterator2 = keySet2.iterator();
		String id = iterator2.next();				
		User u_map = userMap.get(id);				//拿出基准值
		
		for(String key:keySet2){
			User user = userMap.get(key);
			if(user.getAge()<u_map.getAge()){
				u_map=user;
			}
		}
		
		System.out.println("age最小的用户："+u_map);
	}
	
}
