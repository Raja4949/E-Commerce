package com.cao.dao;
import com.cao.model.Orderdetail;

public interface Orderdao {
	public boolean paymentProcess(Orderdetail orderdetail);
	public boolean updateCartItemStatus(String username,int orderId);

}
