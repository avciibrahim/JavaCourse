package kodlamaIO.dataAccess;

import kodlamaIO.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Eğitmen Hibernate veri tabanına kaydedildi: " + instructor.getName());
		
	}

}
