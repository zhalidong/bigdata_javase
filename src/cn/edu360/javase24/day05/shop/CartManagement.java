package cn.edu360.javase24.day05.shop;

import java.util.ArrayList;

/**
 * 
 * @author Administrator
 *
 */
public class CartManagement {
	private ArrayList<Product> cart = new ArrayList<>();
	
	//往购物车中添加商品 传入的参数是如下格式 pdts1:1,pdts2:3
	public void addProductToCart(String selectPdts,ProductManagement productManagement){
		
		String[] split = selectPdts.split(",");
		//循环切割 pdts1:1
		for(int i=0;i<split.length;i++){
			String[] pdtAndNum = split[i].split(":");
			//找出用户所选择的这个商品的id和数量
			String id = pdtAndNum[0];
			String num = pdtAndNum[1];
			
			//构造一个商品对象
			Product product = new Product();
			//将id和数量设置到商品对象中
			product.setProductId(id);
			//把字符串解析成整数
			product.setNum(Integer.parseInt(num));
			//想办法补全商品名和价格  利用的是商品管理器中的商品数据
			Product productById = productManagement.getProductById(id);
			product.setProductName(productById.getProductName());
			product.setPrice(productById.getPrice());
			
			//将商品数据添加到购物车list
			cart.add(product);
		}
	
	}
	
	//从购物车移除商品
	
	
	//打印购物车信息
	public void showCart(){
		for(int i=0;i<cart.size();i++){
			System.out.println(cart.get(i));
		}
	}
	
	//修改购物车中的商品数量
	
	
}
