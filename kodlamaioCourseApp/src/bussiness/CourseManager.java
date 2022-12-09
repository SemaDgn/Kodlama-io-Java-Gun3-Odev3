package bussiness;


import dataAccess.CourseDao;
import entities.Courses;
import logging.Logger;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;		
		this.loggers = loggers;
	}

	public void add(Courses _courses) throws Exception {		
			if (_courses.getPrice()<0) {
				throw new Exception("Bu kursun fiyatı 0'dan küçük olamaz.");
			}
		
		courseDao.add(_courses);
		for (Logger logger : loggers) {
			logger.log();
		}
	}

	public void delete(Courses courses) {
		courseDao.delete(courses);
		for (Logger logger : loggers) {
			logger.log();
		}
	}

	public void update(Courses courses) {
		courseDao.update(courses);
		for (Logger logger : loggers) {
			logger.log();
		}
	}

}
