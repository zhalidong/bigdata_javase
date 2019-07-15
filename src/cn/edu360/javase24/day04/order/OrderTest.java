package cn.edu360.javase24.day04.order;

import java.util.ArrayList;

public class OrderTest {
	public static void main(String[] args) {
		Order o1 = new Order();
		o1.orderId="1";
		//创建用户
		User u_zwj = new User("1","张无忌","黄金vip");
		o1.user=u_zwj;
		
		//创建商品列表
		ArrayList<Product> pdts = new ArrayList<Product>();
		Product p1 = new Product("p1","鞭子",18.8f,10);
		Product p2 = new Product("p2","绳索",28.8f,5);
		pdts.add(p1);
		pdts.add(p2);
		
		o1.pdts=pdts;
		//调用order对象o1调用方法来计算总金额 并给对象上的属性赋值
		o1.setAmountFee();
		
		
		System.out.println("订单总金额"+o1.amountFee);
		
	}
}
