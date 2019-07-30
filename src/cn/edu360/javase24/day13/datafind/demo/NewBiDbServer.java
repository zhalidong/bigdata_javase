package cn.edu360.javase24.day13.datafind.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 数据库服务器
 * @author Administrator
 *
 */
public class NewBiDbServer {
	
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(3306);
		ReadData readData = new ReadData();
		while(true){
			Socket sc = ss.accept();
			new Thread(new FindDataRunnable(sc, readData)).start();
			
		}
		
	}
	
}
