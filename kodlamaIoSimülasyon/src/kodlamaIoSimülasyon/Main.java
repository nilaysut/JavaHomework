package kodlamaIoSimülasyon;

import kodlamaIoSimülasyon.business.CategoryManager;
import kodlamaIoSimülasyon.business.CourseManager;
import kodlamaIoSimülasyon.dataAccess.CategoryHibernateDal;
import kodlamaIoSimülasyon.dataAccess.CourseJdbcDal;
import kodlamaIoSimülasyon.entities.Category;
import kodlamaIoSimülasyon.entities.Course;
import kodlamaIoSimülasyon.logging.Logger;

public class Main {

	public static void main(String[] args) throws Exception {

		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(1, "Programlama");
		Logger[] loggers = {};

		CategoryManager categoryManager = new CategoryManager(new CategoryHibernateDal(), loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);

		Course course1 = new Course(1, "java kursu", "Engin Demirog", 8, "2022 java kampı", "src='java.img'");
		Course course2 = new Course(1, "java kursu", "Engin Demirog", 8, "2022 java kampı", "src='java.img'");
		Logger[] loggers1 = {};

		CourseManager courseManager = new CourseManager(new CourseJdbcDal(), loggers1);
		courseManager.add(course1);
		courseManager.add(course2);

	}

}
