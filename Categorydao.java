package com.cao.dao;
import java.util.List;

import com.cao.model.Category;

public interface Categorydao {
	public boolean addCategory(Category category);
	public boolean deleteCategory(Category category);
	public boolean updateCategory(Category category);
	public Category getCategory(int categoryId);
	public List<Category> listCategories();
	

}
