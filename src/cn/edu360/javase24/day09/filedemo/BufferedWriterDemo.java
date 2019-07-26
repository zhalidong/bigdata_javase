package cn.edu360.javase24.day09.filedemo;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws Exception{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:/x.y"),"UTF-8"));
		bw.write("查力冬");
		bw.write(13);
		bw.write("查力冬");
		bw.close();
		
	}
	
}
