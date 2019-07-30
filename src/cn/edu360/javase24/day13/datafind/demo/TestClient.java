package cn.edu360.javase24.day13.datafind.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

public class TestClient {
	
	@Test
	public void testById() throws Exception {
		Socket socket = new Socket("localhost",3306);
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		
		out.write("select *from p.dat where id=4".getBytes());
		byte[] b =new byte[100];
		int num = in.read(b);
		
		System.out.println(new String(b,0,num));
		out.close();
		in.close();
		socket.close();
	}
	
	
	
}
