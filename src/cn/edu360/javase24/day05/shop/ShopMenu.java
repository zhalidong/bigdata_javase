package cn.edu360.javase24.day05.shop;
/**
 * 自动售货系统:
 *1.可以展现商店中的所有商品信息 
 *2.可以处理用户的购物车操作
 *3.能够用户的购物车生成订单
 */
import java.util.Scanner;

/**
 * 这是整个售货系统 的入口程序
 * @author Administrator
 *
 */
public class ShopMenu {
	
	public static void main(String[] args) {
		//构造一个商品池管理器
		ProductManagement pmgmt = new ProductManagement();
		
		//构造一个购物车管理器
		CartManagement cartMgmt = new CartManagement();
		
		
		
		//把pmgmt当做参数传入下面方法中进行添加数据
		//利用工具方法为商品池添加商品数据
		CreateSomeProduct.create(pmgmt);
		
		System.out.println("欢迎来到商场 请选择操作");
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			System.out.println("1.浏览商品 2.购物 3.查看购物车 4.修改购物车 5.提交订单 6.付款 7.退出");
			String command = sc.nextLine();
			
			switch (command) {
			case "1":
				pmgmt.showProducts();
				break;
			case "2":
				System.out.println("请选择你需要购买的商品");
				String selectPdts = sc.nextLine();
				cartMgmt.addProductToCart(selectPdts,pmgmt);
				
				break;
			case "3":
				cartMgmt.showCart();
				break;
			case "4":
				System.out.println("修改");
				break;
			case "5":
				System.out.println("提交订单");
				break;
			case "6":
				System.out.println("付款");
				break;
			case "7":
				flag = false;
				break;
			default :
				System.out.println("输入错误");
				break;
			}
		
		}
		
	}
}
