package cn.edu360.javase24.day06.homework;
/**
 * 造5个商品对象，id分别为 “1”,"2","3","4","5"
 * 然后造3个用户对象，
 * 然后模拟生成购物车
 * @author Administrator
 *
 */
public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product("1","咖啡1",98.8f,1);
		Product p2 = new Product("2","咖啡2",198.8f,1);
		Product p3 = new Product("3","咖啡3",988.8f,1);
		Product p4 = new Product("4","咖啡4",998.8f,1);
		Product p5 = new Product("5","咖啡5",998.8f,1);
		
		User u1 = new User("1", "张三1", "111","1384848484" , 18, 1800);
		User u2 = new User("2", "张三2", "111","1384848484" , 18, 1800);
		User u3 = new User("3", "张三3", "111","1384848484" , 18, 1800);
		
		//购物车 用hashmap实现
		
		
	}
	
}
