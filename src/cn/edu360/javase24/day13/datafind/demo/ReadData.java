package cn.edu360.javase24.day13.datafind.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

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
	
}
