package cn.edu360.javase24.day06.homework;
/**
 * 6、定义一个Product类，包含以下属性
pId
pName
price
num
 * 
 * @author Administrator
 *
 */
public class Product {
	private String pId;
	private String pName;
	private float price;
	private int num;
	
	
	public Product(){}
	
	public Product(String pId, String pName, float price, int num) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.num = num;
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", price=" + price
				+ ", num=" + num + "]";
	}
	
	
	
	
}
