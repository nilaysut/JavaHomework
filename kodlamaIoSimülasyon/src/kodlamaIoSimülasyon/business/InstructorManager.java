package kodlamaIoSimülasyon.business;

import kodlamaIoSimülasyon.dataAccess.IInstructorDal;
import kodlamaIoSimülasyon.entities.Instructor;
import kodlamaIoSimülasyon.logging.Logger;

public class InstructorManager {
	private IInstructorDal instructorDal;
    private Logger[] loggers;



    public InstructorManager(IInstructorDal instructorDal, Logger[] loggers) {
        this.instructorDal = instructorDal;
        this.loggers = loggers;
    }

    public void Add(Instructor instructor)  {

        for (Logger logger : loggers) {
            logger.log(instructor.getFirstName()+instructor.getLastName());
        }

        instructorDal.add(instructor);
    }
}


