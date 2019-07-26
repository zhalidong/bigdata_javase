package cn.edu360.javase24.day10.objectstream.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象输出流
 * 把一个对象写入到磁盘叫做   序列化
 * 把二进制序列读取数据恢复对象叫做	反序列化
 * @author Administrator
 *
 */
public class ObjectOutputStreamDemo {
	
	public static void main(String[] args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/user.obj"));
		User u1 = new User("查力冬", 38, 2800, 8000);
		
		//writeObject()方法要求user对象必须序列化
		oos.writeObject(u1);
		
		
		oos.close();
	}
	
}
