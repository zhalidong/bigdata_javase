package cn.edu360.javase24.day10.excersize;

import java.io.Serializable;
/**
 * 用来描述一个具体事物的类
 * 实体类
 * javabean
 * @author Administrator
 *
 */
public class Product implements Serializable{

	private String pId;
	private String pName;
	private float price;
	
	public void set(String pId, String pName, float price) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
	}
	
	
	public Product(){}
	
	public Product(String pId, String pName, float price) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "[pId=" + pId + ", pName=" + pName + ", price=" + price + "]";
	}
	
	
	
	
	
	
}
