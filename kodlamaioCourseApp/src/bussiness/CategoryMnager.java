package bussiness;

import java.util.List;



import dataAccess.CategoryDao;
import entities.Category;
import logging.Logger;


public class CategoryMnager {
	private CategoryDao categoryDao;
	List<Category> categories;
	private Logger[] loggers;
	
	public CategoryMnager(CategoryDao categoryDao,Logger[] loggers, List<Category> categories) {
		this.categoryDao=categoryDao;
		this.loggers=loggers;
		this.categories=categories;
		
	}

	public void add(Category category) throws Exception {
		for (Category category1 : categories) {
		
			if (category1.getName() == category.getName()) {
				throw new Exception("Bu isimle bir kategori bulunmaktadır. Lütfen farklı bir isim giriniz.");
			}

		}
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log();
		}
	}

	public void delete(Category category) {
		categoryDao.delete(category);
		for (Logger logger : loggers) {
			logger.log();
		}
	}

	public void update(Category category) {
		categoryDao.update(category);
		for (Logger logger : loggers) {
			logger.log();
		}
	}
	

}
