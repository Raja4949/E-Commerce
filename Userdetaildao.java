package com.cao.dao;
import com.cao.model.Userdetail;

public interface Userdetaildao {
public boolean addUserdetail(Userdetail userdetail);
	
	public boolean updateUserdetail(Userdetail userdetail);
	
	public Userdetail getUserdetail(String username);
	

}
