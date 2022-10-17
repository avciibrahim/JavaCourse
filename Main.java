package kodlamaIO;

import kodlamaIO.business.CategoryManager;
import kodlamaIO.business.CourseManager;
import kodlamaIO.business.InstructorManager;
import kodlamaIO.core.logger.FileLogger;
import kodlamaIO.core.logger.Logger;
import kodlamaIO.core.logger.MailLogger;
import kodlamaIO.dataAccess.HibernateCategoryDao;
import kodlamaIO.dataAccess.HibernateInstructorDao;
import kodlamaIO.dataAccess.JdbcCourseDao;
import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;
import kodlamaIO.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Logger[] loggers = { new FileLogger(), new MailLogger() };
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers );
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
				
		Category category = new Category();
		
		category.setId(1);
		category.setCategoryName("Tasarım");
		categoryManager.add(category);
		
		Course course = new Course();
		
		course.setId(1);
		course.setCategory("Kodlama");
		course.setCourseName("Python");
		courseManager.add(course);
		
		Instructor instructor = new Instructor();
		
		instructor.setId(1);
		instructor.setCourse("Java");
		instructor.setFirstName("İbrahim");
		instructor.setLastName("Avcı");
		instructorManager.add(instructor);
		
	}

}
