package cn.edu360.javase24.day10.excersize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * p01,香蕉,10.8
   p02,苹果,10.8
   p03,榴莲,28.8
   p04,葡萄,18.8

然后将这4个对象存入文件 pdt.obj
 * 
 * @author Administrator
 *
 */
public class ProductSave {
	
	public static void main(String[] args) throws Exception {
		
		Product p1 = new Product("p01","香蕉",10.8f);
		Product p2 = new Product("p02","苹果",10.8f);
		Product p3 = new Product("p03","榴莲",28.8f);
		Product p4 = new Product("p04","葡萄",18.8f);
		
		
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("d:/pdts.obj"));
		os.writeObject(p1);
		os.writeObject(p2);
		os.writeObject(p3);
		os.writeObject(p4);
		
		
		
		
		
		os.close();
	}
	
}
