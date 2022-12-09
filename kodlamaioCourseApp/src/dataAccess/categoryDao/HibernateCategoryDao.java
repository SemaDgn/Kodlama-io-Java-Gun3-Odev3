package dataAccess.categoryDao;

import dataAccess.CategoryDao;
import entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Kategori hibernate ile eklenmiştir. " + category.getName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Kategori hibernate ile silinmiştir. " + category.getName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Kategori hibernate ile güncellenmiştir. " + category.getName());
		
	}

}
