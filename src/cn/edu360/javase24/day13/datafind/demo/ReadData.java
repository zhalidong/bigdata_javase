package cn.edu360.javase24.day13.datafind.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class ReadData {
	//根据id查找商品
	public Product findProductById(int id) throws Exception {
		
		//可以从文件中任何位置开始读取数据的工具 RandomAccessFile
		RandomAccessFile raf = new RandomAccessFile("d:/p.dat", "r");
		//读id=2的商品数据
		long pos =id*28;
		
		//让raf的读取位置跳到指定的pos位置
		raf.seek(pos);
		//开始读数据即可
		//先读4个自己返回一个整数
		int Pid = raf.readInt();
		//再读20字节
		byte[] b = new byte[20];
		raf.read(b);
		//将这20个字节转成字符串 但是尾部有大量空格
		String string = new String(b);
		String name = string.trim();	//去掉首尾的空格
		
		//再读价格
		float price = raf.readFloat();
		raf.close();
		Product product = new Product(Pid, name, price);
		return product;
	}
	//根据名称查询商品
	public List<Product> findProductByName(String keyword) throws Exception{
		ArrayList<Product> pList = new ArrayList<>();
		
		//可以从文件中任何位置开始读取数据的工具 RandomAccessFile
		RandomAccessFile raf = new RandomAccessFile("d:/p.dat", "r");
		
		int i=0;
		while((i+1)*28<raf.length()){
			raf.seek(4+28*i);	//将读取位置定位到name字段的起始位置
			byte[] b = new byte[20];
			raf.read(b);
			String name = new String(b).trim();
			if(name.contains(keyword)){
				raf.seek(i*28); 	//回到这条数据的起始位置
				int id = raf.readInt();	//读id字段
				raf.read(b);			//读name字段
				float price = raf.readFloat(); 	//读price字段
				pList.add(new Product(id, name, price));//将符合条件的数据加入list中
			}
			
			i++;
		}
		return pList;
	}
	
	
	
}
