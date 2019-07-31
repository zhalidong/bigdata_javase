package cn.edu360.javase24.day14.demo;

import cn.edu360.javase24.day13.datafind.demo.Product;
/*
 * 三元表达式
 */
public class SanYuanExpression {
	public int getMax(int a,int b){
		return a>b?a:b;				//三元运算符是一种语法
	}
	
	public Product getMaxPriceProduct(Product p1,Product p2){
		
		return p1.getPrice()>p2.getPrice()?p1:p2;
		
	}
	
	public static void main(String[] args) {
		SanYuanExpression temp = new SanYuanExpression();
		int max = temp.getMax(99, 100);
		System.out.println(max);
	}
	
	
}
