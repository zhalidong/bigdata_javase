package cn.edu360.javase24.exam02.difficult;

import java.util.ArrayList;

import org.junit.Test;

public class ProductServiceImplTest {
	
	@Test
	public void testAdd(){
		Product p = new Product("1", "手环", 199.9f, 10000);
		ProductServiceImpl service = new ProductServiceImpl();
		service.addProduct(p);
		ArrayList<Product> arrayList = service.getAllProducts();
		
		for(Product p1:arrayList){
			System.out.println(p1);
		}
		
	}
	
}
