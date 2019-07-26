package cn.edu360.javase24.day09.filedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 * 利用FileInputStream来按行
 * @author Administrator
 *
 */
public class ReadLine {
	
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("d:/a.txt");
		
		int read=0;
		byte[] buf = new byte[1024];
		int i=0;
		while((read = fis.read())!=-1){
			if(read==13){
				break;
			}
			buf[i] = (byte)read;
			i++;
		}
		
		System.out.println(new String(buf,0,i));
	}
	
}
