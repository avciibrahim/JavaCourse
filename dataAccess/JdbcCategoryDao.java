package kodlamaIO.dataAccess;

import kodlamaIO.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		
		System.out.println("Kategori JDBC veri tabanına kaydedildi: " + category.getCategoryName());
		
	}

}
