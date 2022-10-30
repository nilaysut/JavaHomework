package kodlamaIoSimülasyon.dataAccess;

import kodlamaIoSimülasyon.entities.Instructor;

public class InstructorHibernateDal  implements  IInstructorDal{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veri tabanına eklendi: " );

    }

}
