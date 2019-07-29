package cn.edu360.javase24.day13.stocketdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	
	public static void main(String[] args) throws Exception {
		//启动一个stocket服务端(本质上就是向操作系统注册一个端口号 并且监听这个端口上的)
		ServerSocket ss = new ServerSocket(10000);
		System.out.println("服务端启动...");
		//监听这个端口上的信息
		Socket sc = ss.accept(); 			//等待并接受客户端的请求	建立socket连接	这是一个阻塞方法
		
		//从连接中接受数据		需要先获得一个输入流工具
		InputStream in = sc.getInputStream();
		
		//从输入流中拿数据
		byte[] b = new byte[1024];
		int num = in.read(b);
		String str = new String(b,0,num);
		System.out.println("收到客户端的消息"+str);
		//发送数据
		OutputStream out = sc.getOutputStream();
		out.write("我是红红".getBytes());
		
		
		out.close();
		
//		int read=0;
//		while((read = in.read())!=-1){
//			System.out.println((char)read);
//		}
//		int read = in.read();		//read方法也是阻塞的
//		char x = (char)read;
//		System.out.println(x);
		
		
		in.close();
		sc.close();
	}
	
}
