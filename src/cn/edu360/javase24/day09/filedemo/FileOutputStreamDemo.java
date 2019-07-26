package cn.edu360.javase24.day09.filedemo;

import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("d:/xx.22");
		//string字符串转换成byte
		String s = "a你好";
		byte[] bytes = s.getBytes("UTF-8");	//将字符串按指定编码集编码 -->将信息转成二进制数
		
		fos.write(bytes);		//这样写入的数据 会将文件中原来的数据覆盖
		
		fos.close();
		
		//如果要往一个文件中追加数据		则在FileOutputStream的构造参数中多传一个true
		FileOutputStream fos2 = new FileOutputStream("d:/xx.22",true);
		fos2.write(",sb".getBytes("UTF-8"));
		fos2.close();
		
		
	}
	
}
