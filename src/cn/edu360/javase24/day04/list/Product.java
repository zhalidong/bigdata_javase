package cn.edu360.javase24.day04.list;
/**
 * 商品类
 * @author Administrator
 *
 */
public class Product {
	
	public String pId;
	public String pName;
	public float price;
	public int number;
	
	public float getAmount(){
		return this.price*this.number;
	}
	
	
	//方法就是用一个代号代表一端逻辑
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", price=" + price + ", number=" + number + "]";
	}
	
	
	
	
}
