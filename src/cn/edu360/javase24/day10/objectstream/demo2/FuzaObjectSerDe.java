package cn.edu360.javase24.day10.objectstream.demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;


/**
 * 复杂类型对象的存	取	-----序列化和反序列化
 * @author Administrator
 *
 */
public class FuzaObjectSerDe {
	
	@Test
	public  void TestList() throws Exception {
		//将一个list对象直接写入文件
		User u1 = new User("查力冬", 38, 2800, 8000);
		User u2 = new User("慕容复", 58, 3800, 0);
		ArrayList<User> ulist = new ArrayList<>();
		ulist.add(u1);
		ulist.add(u2);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/user.list"));
		
		oos.writeObject(ulist);
		oos.close();
		
		
		
		//从文件中读取一个list对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/user.list"));
		
		ArrayList<User> object = (ArrayList<User>)ois.readObject();
		System.out.println(object);
		
		ois.close();
	}
	//将一个hashmap对象写入文件中
	@Test
	public void TestHashMap() throws Exception{
		User u1 = new User("查力冬", 38, 2800, 8000);
		User u2 = new User("慕容复", 58, 3800, 0);
		HashMap<String,User> map = new HashMap<>();
		
		map.put(u1.getName(), u1);
		map.put(u2.getName(), u2);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/user.map"));
		
		oos.writeObject(map);
		oos.close();
		
		
		
		
		
	}
	
	
}
