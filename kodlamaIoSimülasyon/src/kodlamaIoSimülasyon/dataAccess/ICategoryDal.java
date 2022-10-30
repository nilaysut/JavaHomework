package kodlamaIoSimülasyon.dataAccess;

import kodlamaIoSimülasyon.entities.Category;

public interface ICategoryDal {
	 void add(Category category);
	 boolean check(String categoryName);

}
