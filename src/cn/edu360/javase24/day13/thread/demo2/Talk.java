package cn.edu360.javase24.day13.thread.demo2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Talk implements Runnable{
	Socket sc;
	
	public Talk(Socket sc){
		this.sc=sc;
	}
	
	
	@Override
	public void run() {
		try{
			//获取输入流 输出流
		InputStream in = sc.getInputStream();
		OutputStream out = sc.getOutputStream();
		
		//收第一个问题
		byte[] b = new byte[1024];
		int num = in.read(b);
		System.out.println("收到客户端的问题1"+new String(b,0,num));
		
		//回复第一个问题
		out.write("我是战士".getBytes());
		
		num = in.read(b);
		System.out.println("收到客户端的问题2"+new String(b,0,num));
		
		out.write("我18岁".getBytes());
		
		in.close();
		out.close();
		sc.close();
		}catch(Exception e){
			System.out.println("发生异常了...");
		}
		
	}

}
