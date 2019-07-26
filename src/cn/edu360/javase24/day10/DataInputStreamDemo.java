package cn.edu360.javase24.day10;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
/**
 * DataInputStream可以从字节流中直接转换出具体的数据类型
 * 
 * @author Administrator
 *
 */
public class DataInputStreamDemo {

	public static void main(String[] args) throws Exception {
		DataInputStream dis = new DataInputStream(new FileInputStream("d:/o.txt"));
		int age = dis.readInt();
		System.out.println(age);
		
		
		dis.close();
	}
	
}
