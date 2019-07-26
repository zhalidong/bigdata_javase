package cn.edu360.javase24.day10;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * DataOutputStream是一个包装流	它可以将各种类型的数据在内部转成byte字节	然后利用FileOutputStream写入文件中
 * 
 * 
 * 
 * @author Administrator
 *
 */
public class DataOutputStreamDemo {
	
	public static void main(String[] args) throws Exception {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("d:o.txt"));
		//写入一个整数
		int a = 18;
		dos.writeInt(a);
		
		
		
		dos.close();
	}
	
}
