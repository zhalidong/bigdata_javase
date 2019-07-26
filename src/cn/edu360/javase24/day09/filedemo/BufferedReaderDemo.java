package cn.edu360.javase24.day09.filedemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
/**
 * FileInputStream的一个高级包装工具	bufferedreader
 * 它可以直接按照文本数据来读文件，而且可以按行读
 * @author Administrator
 *
 */
public class BufferedReaderDemo {
	
	public static void main(String[] args) throws Exception {
		//BufferReader包装了字节流，并且可以按指定的编码集将字节转成字符
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/a.txt"),"utf-8"));
		String readLine = br.readLine();	
		System.out.println(readLine);
		
		while((readLine = br.readLine())!=null){
			System.out.println(readLine);
		}
		
		br.close();
		
		
	}
	
}
