package kodlamaIO.dataAccess;

import kodlamaIO.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {

		System.out.println("Eğitmen JDBC veri tabanına kaydedildi: " + instructor.getName());
		
	}

}
