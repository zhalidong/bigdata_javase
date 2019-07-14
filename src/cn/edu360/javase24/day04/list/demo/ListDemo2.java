package cn.edu360.javase24.day04.list.demo;

import java.util.ArrayList;

import cn.edu360.javase24.day04.list.Product;

public class ListDemo2 {
	
	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.pId="1";
		p1.pName="肥皂";
		p1.price=2.5f;
		p1.number=2;
		
		Product p2 = new Product();
		p2.pId="2";
		p2.pName="手铐";
		p2.price=2.55f;
		p2.number=1;	
		
		Product p3 = new Product();
		p3.pId="3";
		p3.pName="鞭子";
		p3.price=1.55f;
		p3.number=1;		
		
		Product p4 = new Product();
		p4.pId="4";
		p4.pName="锥子";
		p4.price=1.85f;
		p4.number=2;	
		
		Product p5 = new Product();
		p5.pId="5";
		p5.pName="风油精";
		p5.price=8;
		p5.number=2;
		
		ArrayList<Product> pdts = new ArrayList<Product>();
		pdts.add(p1);
		pdts.add(p2);
		pdts.add(p3);
		pdts.add(p4);
		pdts.add(p5);
		
		//计算list中商品的总金额
		float amount=0;
		for(int i=0;i<pdts.size();i++){
			amount+=pdts.get(i).price * pdts.get(i).number;
				
		}
		System.out.println(amount);
		
		//计算list中所有商品中单价最高商品
		Product tmp = pdts.get(0);
		for(int i=1;i<pdts.size();i++){
			if (pdts.get(i).price>tmp.price) {
				tmp=pdts.get(i);
			}
		}
		System.out.println(":"+tmp.pId+tmp.pName+tmp.price);
		//计算list中所有商品中成交金额最高商品
		tmp = pdts.get(0);
		for(int i=1;i<pdts.size();i++){
			if (pdts.get(i).getAmount()>tmp.getAmount()) {
				tmp=pdts.get(i);
			}
		}
		System.out.println(":"+tmp.pId+tmp.pName+tmp.price);
		
		//求出list中单价排名前3的商品
		for(int i=0;i<pdts.size()-1;i++){
			for(int j=0;j<pdts.size()-i-1;j++){
				if (pdts.get(j).price > pdts.get(j+1).price) {
					Product t = pdts.get(j);
					Product p_j1 = pdts.get(j+1);
					pdts.set(j, p_j1);		//将角标j上的数据换成j+1上的数据
					pdts.set(j+1, t);		//将角标j+1上的数据换成j上的数据
					
				}
			}
		}
		
		
		
		
		
	}
}
