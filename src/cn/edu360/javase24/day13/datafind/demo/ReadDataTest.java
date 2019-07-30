package cn.edu360.javase24.day13.datafind.demo;

import java.util.List;

public class ReadDataTest {

	public static void main(String[] args) throws Exception {
		ReadData readData = new ReadData();
//		Product p = readData.findProductById(4);
		
		List<Product> pList = readData.findProductByName("菠萝");
		System.out.println(pList);
		
//		System.out.println(p);
		
	}
	
}
