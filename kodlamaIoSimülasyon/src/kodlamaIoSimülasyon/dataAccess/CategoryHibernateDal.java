package kodlamaIoSimülasyon.dataAccess;

import java.util.ArrayList;

import kodlamaIoSimülasyon.entities.Category;

public class CategoryHibernateDal implements ICategoryDal {
	ArrayList<Category> categories = new ArrayList<Category>();

	@Override
	public void add(Category category) {

		System.out.println("Hibernate ile veri tabanina eklendi: " + category.getCategoryName());
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
