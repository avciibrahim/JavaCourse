package kodlamaIO.business;

import kodlamaIO.core.logger.Logger;
import kodlamaIO.dataAccess.InstructorDao;
import kodlamaIO.entities.Instructor;

public class InstructorManager {

	InstructorDao _instructorDao;
	Logger[] _loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		_instructorDao = instructorDao;
		_loggers = loggers;
	}
	
	public void add(Instructor instructor) throws Exception {
		if (instructor.getName().equals("Engin Demiroğ")) {
			throw new Exception("Bu isimle mevcut bir eğitmen vardır.");
		}
		_instructorDao.add(instructor);
	    for (Logger logger : _loggers) {
			logger.Logging("Eğitmen eklendi: " + instructor.getName());
		}
	}
}
