package dataAccess.categoryDao;

import dataAccess.CategoryDao;
import entities.Category;

public class JdbcCategoryDao   implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Kategori JDBC ile eklenmiştir. " + category.getName());
	}

	@Override
	public void delete(Category category) {
		System.out.println("Kategori JDBC ile silinmiştir. " + category.getName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Kategori JDBC ile güncellenmiştir. " + category.getName());
		
	}

}
