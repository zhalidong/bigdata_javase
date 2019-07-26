package cn.edu360.javase24.day09.product;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * //静态hashmap作为数据存储
   提供一个菜单：可以让用户输入商品数据  "p1,六个核桃,4"
用户添加的商品需要持久化保存(放在文件中)
可以让用户查看所有的商品
 * 
 * 
 * @author Administrator
 *
 */
public class Menu {
	
	public static void main(String[] args) throws Exception{
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		ProductDao dao=  new ProductDaoImpl();
		
		while(flag){
			System.out.println("1 添加商品 2查看商品 3 退出");
			String line = sc.nextLine();
			
			switch(line){
			
			case "1":
				System.out.println("请输入商品信息");
				String nextline = sc.nextLine();
				dao.addProduct(nextline);
				break;
			case "2":
				ArrayList<Product> pdts = dao.getAllProducts();
				for(Product tmp:pdts){
					System.out.println(tmp);
				}
				break;
			case "3":
				flag=false;
				break;
			default:
				System.out.println("有病啊 不会看菜单啊");
				break;
			}
		}
	}
	
}
