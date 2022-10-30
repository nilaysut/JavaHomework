package kodlamaIoSimülasyon.business;

import kodlamaIoSimülasyon.dataAccess.ICourseDal;
import kodlamaIoSimülasyon.entities.Course;
import kodlamaIoSimülasyon.logging.Logger;

public class CourseManager {
	private ICourseDal courseDal;
	private Logger[] loggers;

	public CourseManager(ICourseDal courseDal, Logger[] loggers) {
		this.courseDal = courseDal;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {

		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyati 0dan kucuk olamaz");
		}

		if (courseDal.check(course.getTitle())) {
			throw new Exception("kurs ismi tekrar edemez");
		}

		courseDal.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getTitle());
		}
	}

}
