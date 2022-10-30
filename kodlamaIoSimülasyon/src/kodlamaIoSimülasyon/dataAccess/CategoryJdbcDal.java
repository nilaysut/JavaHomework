package kodlamaIoSimülasyon.dataAccess;

import java.util.ArrayList;

import kodlamaIoSimülasyon.entities.Category;

public class CategoryJdbcDal implements ICategoryDal {
	ArrayList<Category> categories = new ArrayList<Category>();

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veri tabanina eklendi: ");
		categories.add(category);

	}

	@Override
	public boolean check(String categoryName) {
		for (Category category : categories) {
			if (category.getCategoryName().equalsIgnoreCase(categoryName)) {
				return true;
			}
		}
		return false;
	}

}
