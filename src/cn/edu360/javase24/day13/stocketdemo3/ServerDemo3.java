package cn.edu360.javase24.day13.stocketdemo3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo3 {
	
	public static void main(String[] args) throws Exception {
		
		ServerSocket ss = new ServerSocket(8080);
		int i=1;
		while(true){
			System.out.println("获得"+i+"连接了....");
		Socket sc = ss.accept();
		
		
		//收客户端的第一个问题
		InputStream in = sc.getInputStream();
		byte[] b = new byte[1024];
		int num = in.read(b);
		System.out.println("收到客户端的第一个问题"+new String(b,0,num));
		
		//回答第一个问题
		OutputStream out = sc.getOutputStream();
		out.write("我是大美男".getBytes());
		
		//接收第二个问题
		num = in.read(b);
		System.out.println("收到客户端的第二个问题"+new String(b,0,num));
		
		//回答第一个问题
		out = sc.getOutputStream();
		out.write("我是大美男".getBytes());
		
		in.close();
		out.close();
		sc.close();
		i++;
		}
	}
	
}
