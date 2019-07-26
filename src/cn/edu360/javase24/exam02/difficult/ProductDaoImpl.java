package cn.edu360.javase24.exam02.difficult;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ProductDaoImpl implements ProductDao{
	/**
	 * 添加一个商品到数据库
	 */
	@Override
	public void addProduct(Product p) {
		ProductDatabase.pMap.put(p.getpId(), p);
		
	}

	@Override
	public Set<Product> getAllProducts() {
		//valuses()	拿出hashmap中的所有商品
		Collection<Product> values = ProductDatabase.pMap.values();
		HashSet<Product> hashSet = new HashSet<>();
		for(Product p:values){
			hashSet.add(p);
		}
		return hashSet;
	}

	@Override
	public Product getProductById(String pId) {
		Product product = ProductDatabase.pMap.get(pId);
		return product;
	}

	@Override
	public Product getProductByName(String pName) {
		Collection<Product> values = ProductDatabase.pMap.values();
		for(Product p:values){
			if(p.getpName().equals(pName)){
				return p;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Product> getProductByPriceRange(float minPrice,
			float maxPrice) {
		ArrayList<Product> arrayList = new ArrayList<>();
		Collection<Product> values = ProductDatabase.pMap.values();
		for(Product p :values){
			if(p.getPrice()>=minPrice && p.getPrice()<=maxPrice){
				arrayList.add(p);
			}
		}
		return arrayList;
	}

	@Override
	public void removeProductById(String pId) {
		ProductDatabase.pMap.remove(pId);
		
	}

	@Override
	public void updateProduct(Product p) {
		ProductDatabase.pMap.put(p.getpId(), p);
	}

}
