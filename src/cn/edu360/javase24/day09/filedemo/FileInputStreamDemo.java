package cn.edu360.javase24.day09.filedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 字节流	一次拿一个字节   针对自己的类 是文件输入流  底层是FileInputStream
 * 
 * @author Administrator
 *
 */
public class FileInputStreamDemo {
	
	public static void main(String[] args) throws Exception {
		//一个字符就是一个字节  读取字符
		//要读文件	首先要构造一个FileInputStream对象
		FileInputStream fis = new FileInputStream("d:/a.txt");
		//FileInputStream是一种字节流	是按照一个一个字节去文件中读取数据的
//		int read = fis.read();		//手动一个字节一个字节的读取
//		System.out.println(read);	//十进制的数	读取一个字节
//		
//		read = fis.read();
//		System.out.println(read); 	//读取第二个字节
//		
		//利用fis读到文件末尾后会返回-1 利用循环读取
		int read = 0;
		/*while((read = fis.read())!=-1){
			System.out.println(read);
		}*/
		/**
		 * 如果我要读出数据(文本文件中的数据其实就是字符)
		 * 过程是:还是先读数	然后按照码表	将这个数转成字符
		 */
		 read = 0;
		/*while((read = fis.read())!=-1){
			//char就是一个英文字符 	使用的是asc码表
			char c = (char)read;
			System.out.println(c);
		}*/
		
		
		/**
		 * 一次读取多个字节然后转成莫种数据类型
		 * read(buf)方法  一次读取buf长度个字节数据  并且读到的数据直接填入了buf数组中
		 */
		/*byte[] buf = new byte[8];
		int num = fis.read(buf); 	//返回的是真实读到的字节数量
		String str = new String(buf,0,7);	//利用二进制的byte数组来转成字符串
		System.out.println(str);
		*/
		
		/**
		 * 用while循环来反复读取
		 */
		int num=0;
		byte[] buf = new byte[8];
		 while((num=fis.read(buf))!=-1){
			System.out.println(new String(buf, 0, num));
		}
		
		
		
		
		
	}
	
}
