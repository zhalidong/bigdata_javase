package cn.edu360.javase24.day09.product;
//存数据

import java.util.ArrayList;

public interface ProductDao {
	
	public void addProduct(String line) throws Exception;
	
	public ArrayList<Product> getAllProducts() throws Exception;
	
	
}
