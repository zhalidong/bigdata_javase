package cn.edu360.javase24.day10.objectstream.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	
	public static void main(String[] args) throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/user.obj"));
		User obj = (User)ois.readObject();
		
		System.out.println(obj);
		
		ois.close();
	}
	
	
}
