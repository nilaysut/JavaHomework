package kodlamaIoSimülasyon.dataAccess;

import kodlamaIoSimülasyon.entities.Instructor;

public class InstructorJdbcDal implements  IInstructorDal{

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veri tabanına eklendi: ");
		
	}

}
