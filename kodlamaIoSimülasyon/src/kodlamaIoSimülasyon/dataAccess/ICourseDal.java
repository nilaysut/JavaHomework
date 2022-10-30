package kodlamaIoSimülasyon.dataAccess;

import kodlamaIoSimülasyon.entities.Course;

public interface ICourseDal {
	
	 void add(Course course);
	 boolean check(String title);

}
