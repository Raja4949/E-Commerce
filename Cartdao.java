package com.cao.dao;
import java.util.List;
import com.cao.model.Cart;

public interface Cartdao {
	public boolean addtocart(Cart cart);
	public boolean deletecart(Cart cart);
	public boolean updatecart(Cart cart);
	public Cart getCart(int cartId);
	public List<Cart> listCartitems();
}
