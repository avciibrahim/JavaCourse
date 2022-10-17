package kodlamaIO.business;

import kodlamaIO.core.logger.Logger;
import kodlamaIO.dataAccess.CategoryDao;
import kodlamaIO.entities.Category;

public class CategoryManager {

	CategoryDao _categoryDao;
	Logger[] _loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		_categoryDao = categoryDao;
		_loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		if (category.getCategoryName().equals("Kodlama")) {
			throw new Exception("Bu isimle mevcut bir kategori vardır.");
		}
		
		_categoryDao.add(category);
		for (Logger logger : _loggers) {
			logger.Logging("Kategori Eklendi: "+ category.getCategoryName());
		}
		
	}
}
