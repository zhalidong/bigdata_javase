package cn.edu360.javase24.day13.stocketdemo2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo2 {
	
	public static void main(String[] args) throws Exception {
		
		Socket sc = new Socket("localhost",8080);
		OutputStream out = sc.getOutputStream();
		InputStream in = sc.getInputStream();
		
		//先发第一个问题
		out.write("你是谁啊".getBytes());
		
		//接收第一一个问题的答案
		byte[] b =  new byte[1024];
		int num = in.read(b);
		System.out.println("第一个问题的答案是"+new String(b,0,num));
		
		//先发第二个问题
		out.write("我的理想女友是 谁".getBytes());
		
		num = in.read(b);
		System.out.println("第二个问题的答案是"+new String(b,0,num));

		
		out.close();
		in.close();
		sc.close();
	}
	
}	
