package kodlamaIO.dataAccess;

import kodlamaIO.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		
		System.out.println("Kategori Hibernate veri tabanına kaydedildi: " + category.getCategoryName());
		
	}

}
