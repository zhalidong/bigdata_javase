package cn.edu360.javase24.day13.datafind.demo;

import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;

public class FindDataRunnable implements Runnable{
	Socket sc;
	ReadData readData;
	public FindDataRunnable(Socket sc,ReadData readData){
		this.sc=sc;
		this.readData=readData;
	}
	
	@Override
	public void run() {
		try{
		InputStream in = sc.getInputStream();
		OutputStream out = sc.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(out);
		
		
		//客户端发过来的请求有两种情况
		/*
		 * 1.select * from p.dat where id=3
		 * 2.select * from p.dat where name like 菠萝
		 * 
		 */
		byte[] b = new byte[1024];
		int num = in.read(b);
		String command = new String(b,0,num);
		if(command.contains("id")){
			//根据id查找商品
			String idstr = command.substring(command.indexOf("=")+1);
			int id = Integer.parseInt(idstr);
			Product p = readData.findProductById(id);
			//把对象转字符串
			String a=p.getId()+":"+p.getName()+":"+p.getPrice();
			out.write(a.getBytes("utf-8"));
			out.close();
			sc.close();
		}else {
			//根据名称关键字去查找商品
			String[] split = command.split(" ");
			String keyword = split[split.length-1];
			List<Product> pList = readData.findProductByName(keyword);
			
			//返回数据给客户端
			oos.writeObject(pList);
			out.close();
			oos.close();
			in.close();
			sc.close();
		}
		
		
		
		
		}catch(Exception e){
			
		}
		
		
	}

}
