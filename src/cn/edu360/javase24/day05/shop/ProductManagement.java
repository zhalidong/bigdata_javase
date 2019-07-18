package cn.edu360.javase24.day05.shop;

import java.util.ArrayList;

/**
 * 此类功能
 * 1.保存所有的商品数据
 * 2.提供操作这些数据的方法 (添加商品)
 * @author Administrator
 *
 */
public class ProductManagement {
	//用来装商品对象的list集合
	private ArrayList<Product> pdts = new ArrayList<>();
	
	public ArrayList<Product> getPdts(){
		return this.pdts;
	}
	
	//告诉我id 我就还你一个商品对象
	public Product getProductById(String id){
		for(int i=0;i<pdts.size();i++){
			Product p = pdts.get(i);
			if(p.getProductId().equals(id)){
				return p;
			}
		}
		return null;
	}
	
	
	
	//用来往pdts商品list中添加一个商品
	public void add(Product p){
		this.pdts.add(p);
	}
	
	//将pdts商品list中所有商品打印到控制台
	public void showProducts(){
		for(int i=0;i<pdts.size();i++){
			System.out.println(pdts.get(i));
		}
	}
	
	
	
}
