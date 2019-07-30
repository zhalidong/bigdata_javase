package cn.edu360.javase24.day13.datafind.demo;

public class ReadDataTest {

	public static void main(String[] args) throws Exception {
		ReadData readData = new ReadData();
		Product p = readData.findProductById(4);
		
		System.out.println(p);
		
	}
	
}
