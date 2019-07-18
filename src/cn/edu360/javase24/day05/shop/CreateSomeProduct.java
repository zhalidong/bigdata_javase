package cn.edu360.javase24.day05.shop;

public class CreateSomeProduct {
		
	public static void create(ProductManagement p){
		Product p1 = new Product();
		p1.setNum(5);
		p1.setProductId("pdt1");
		p1.setPrice(2);
		p1.setProductName("肥皂");
		
		Product p2 = new Product();
		p2.setNum(5);
		p2.setProductId("pdt2");
		p2.setPrice(2);
		p2.setProductName("肥皂");	
		
		
		Product p3 = new Product("pdt3", "护理液", 20.8f, 0);
		Product p4 = new Product("pdt4", "剃须刀", 10.8f, 0);
		Product p5 = new Product("pdt5", "防晒霜", 25.8f, 0);
		Product p6 = new Product("pdt6", "洗面奶", 28.8f, 0);
		
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		p.add(p6);
		
		
	}
}
