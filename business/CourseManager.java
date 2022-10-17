package kodlamaIO.business;

import kodlamaIO.core.logger.Logger;
import kodlamaIO.dataAccess.CourseDao;
import kodlamaIO.entities.Course;

public class CourseManager {
	
	Logger[] _loggers;
	CourseDao _courseDao;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		_courseDao = courseDao;		
		_loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		if(course.getCourseName().equals("Java")) {
			throw new Exception("Bu isimle mevcut bir kurs vardır.");
		}
		_courseDao.add(course);
		for (Logger logger : _loggers) {
			logger.Logging("Kurs Eklendi: "+ course.getCourseName());
		}
	}

}
