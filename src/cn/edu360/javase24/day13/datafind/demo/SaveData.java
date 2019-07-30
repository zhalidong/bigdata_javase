package cn.edu360.javase24.day13.datafind.demo;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveData {
	
	public static void main(String[] args) throws Exception {
		
		Product p0 = new Product(0, "苹果", 10.5f);
		Product p1 = new Product(1, "泰国榴莲", 16.5f);
		Product p2 = new Product(2, "菠萝", 20.5f);
		Product p3 = new Product(3, "菠萝蜜", 30.5f);
		Product p4 = new Product(4, "香蕉", 19.5f);
		
		save(p0);
		save(p1);
		save(p2);
		save(p3);
		save(p4);
		
		
	}
	
	public static void save(Product p) throws Exception{
		//将数据按照既定的规则存入文件中
		//id占4个字节 name占20字节price占4个字节
		DataOutputStream dout = new DataOutputStream(new FileOutputStream("d:/p.dat",true));
		dout.writeInt(p.getId());	//写入id
		byte[] bytes = p.getName().getBytes("utf-8");
		byte[] b = new byte[20];
		//jdk提供的数组拷贝工具方法
		System.arraycopy(bytes, 0, b, 0, bytes.length);
		dout.write(b);	//将商品名写入文件 占20字节
		dout.writeFloat(p.getPrice());//将价格按照float写入文件 占4字节
		
		dout.close();
	}
	
	
}
