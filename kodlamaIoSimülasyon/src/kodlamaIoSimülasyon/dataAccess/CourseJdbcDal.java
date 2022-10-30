package kodlamaIoSimülasyon.dataAccess;

import java.util.ArrayList;

import kodlamaIoSimülasyon.entities.Course;

public class CourseJdbcDal implements ICourseDal {

	ArrayList<Course> courses = new ArrayList<Course>();

	@Override
	public void add(Course course) {
		System.out.println("jdbc ile veri tabanına eklendi: ");
		courses.add(course);

	}

	@Override
	public boolean check(String title) {
		for (Course course : courses) {
			if (course.getTitle().equalsIgnoreCase(title)) {
				return true;
			}
		}
		return false;
	}

}
