package com.cao.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
//class that is mapped to the database

@Table //allows you to specify the details of the table that will be used to persist the entity in the database

public class Category {
	@Id
	@GeneratedValue
	int categoryId;

	String categoryName;
	String categoryDesc;
	public int getCategoryId() 
	{
		return categoryId;
	}
	public void setCategoryId(int categoryId) 
	{
		this.categoryId = categoryId;
	}
	public String getCategoryName() 
	{
		return categoryName;
	}
	public void setCategoryName(String categoryName) 
	{
		this.categoryName = categoryName;
	}
	public String getCategoryDesc() 
	{
		return categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) 
	{
		this.categoryDesc = categoryDesc;
	}

}
