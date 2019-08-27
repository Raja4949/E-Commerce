package com.cao.dao;
import java.util.List;

import com.cao.model.Product;

public interface Productdao {
	public boolean addProduct(Product product);
	public boolean deleteProduct(Product product);
	public boolean updateProduct(Product product);
	public Product getProduct(int productId);
	public List<Product> listProducts();

}
