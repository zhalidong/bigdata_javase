package cn.edu360.javase24.day13.stocketdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {
	
	public static void main(String[] args) throws Exception {
		//向服务端发出建立连接的请求
		Socket sc = new Socket("localhost", 10000);
		
		//从连接中拿到一个发数据的工具
		OutputStream out = sc.getOutputStream();
		
		//利用out流发数据
		out.write("who are you".getBytes());
		
		//接收数据
		InputStream in = sc.getInputStream();
		byte[] b = new byte[10];
		int num = in.read(b);
		System.out.println(new String(b,0,num));
		
		in.close();
		out.close();
		sc.close();
		
	}
	
}
