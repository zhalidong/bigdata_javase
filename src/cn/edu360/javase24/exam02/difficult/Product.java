package cn.edu360.javase24.exam02.difficult;

public class Product {
	private String pId;
	private String pName;
	private float price;
	private int stockNum;
	
	public Product(){}
	
	public Product(String pId, String pName, float price, int stockNum) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.stockNum = stockNum;
	}
	
	public void set(String pId, String pName, float price, int stockNum) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.stockNum = stockNum;
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
	public int getStockNum() {
		return stockNum;
	}
	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}
	@Override
	public String toString() {
		return "[pId=" + pId + ", pName=" + pName + ", price=" + price
				+ ", stockNum=" + stockNum + "]";
	}
	
	
	
	
}
