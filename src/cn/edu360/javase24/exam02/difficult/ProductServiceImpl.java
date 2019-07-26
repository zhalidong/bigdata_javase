package cn.edu360.javase24.exam02.difficult;

import java.util.ArrayList;
import java.util.Set;

public class ProductServiceImpl implements ProductService{
	//service层调用Dao层
	ProductDao productDao = new ProductDaoImpl();
	
	@Override
	public void addProduct(Product p) {
		productDao.addProduct(p);
	}
	/**
	 * 在Dao层接收的是set集合  在service中接收的是arraylist 
	 * 所以在service层需要做处理
	 */
	@Override
	public ArrayList<Product> getAllProducts() {
		ArrayList<Product> plist = new ArrayList<>();
		Set<Product> pset = productDao.getAllProducts();
		for(Product p:pset){
			plist.add(p);
		}
		
		return plist;
	}

	@Override
	public Product getProductById(String pId) {

		return productDao.getProductById(pId);
	}

	@Override
	public Product getProductByName(String pName) {

		return productDao.getProductByName(pName);
	}

	@Override
	public ArrayList<Product> getProductByPriceRange(float minPrice,
			float maxPrice) {

		return productDao.getProductByPriceRange(minPrice, maxPrice);
	}

	@Override
	public void removeProductById(String pId) {
		productDao.removeProductById(pId);
	}

	@Override
	public void updateName(String pId, String newName) {
		Product productById = productDao.getProductById(pId); 
		productById.setpName(newName);
		
		productDao.updateProduct(productById);
	}

	@Override
	public void updatePrice(String pId, float newPrice) {
		Product productById = productDao.getProductById(pId);
		productById.setPrice(newPrice);
		
		productDao.updateProduct(productById);
	}

	@Override
	public void updateStockNum(String pId, int newStockNum) {
		Product productById = productDao.getProductById(pId);
		productById.setStockNum(newStockNum);
		productDao.updateProduct(productById);
	}

}
