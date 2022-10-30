package kodlamaIoSimülasyon.business;

import kodlamaIoSimülasyon.dataAccess.ICategoryDal;
import kodlamaIoSimülasyon.entities.Category;
import kodlamaIoSimülasyon.logging.Logger;

public class CategoryManager {
	private ICategoryDal categoryDal;
	private Logger[] loggers;

	public CategoryManager(ICategoryDal categoryDal, Logger[] loggers) {
		this.categoryDal = categoryDal;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {

		if (categoryDal.check(category.getCategoryName())) {
			throw new Exception("kategori ismi tekrarlanamaz");
		}

		categoryDal.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
