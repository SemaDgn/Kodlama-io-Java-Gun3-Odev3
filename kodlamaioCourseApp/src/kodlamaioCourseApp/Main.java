package kodlamaioCourseApp;

import java.util.ArrayList;
import java.util.List;
import bussiness.CategoryMnager;
import bussiness.CourseManager;
import bussiness.InstructorManager;
import dataAccess.categoryDao.JdbcCategoryDao;
import dataAccess.courseDao.JdbcCourseDao;
import dataAccess.instructorDao.HibernateInstructorDao;
import entities.Category;
import entities.Courses;
import entities.Instructor;
import logging.DatabaseLogger;
import logging.EmailLogger;
import logging.FileLogger;
import logging.Logger;

public class Main {

	public static void main(String[] args) throws Exception {

		InstructorManager instructorManager;

		CourseManager courseManager;
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new EmailLogger() };

		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");

		instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		// instructorManager.add(instructor);
		// instructorManager.delete(instructor);
		// instructorManager.update(instructor);

		List<Category> categories = new ArrayList<>();
		CategoryMnager categoryManager = new CategoryMnager(new JdbcCategoryDao(), loggers, categories);

		Category category = new Category();
		category.setId(1);
		category.setName("Eğitimler");
		categories.add(category);
		Category category1 = new Category();
		category1.setId(2);
		category1.setName("Eğitimler");
		categories.add(category1);

		categoryManager.add(category);
	   categoryManager.add(category1);
		// <-------------------------------------------------------------------------------------->

		Courses course = new Courses();
		course.setId(1);
		course.setName("Java");
		course.setCourseInstructor(instructor);
		course.setCategory(category);
		course.setCourseImageLink("https://www.kodlama.io/image.jpg");
		course.setCourseStatus("%50");
		course.setPrice(0);
		courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course);
		

		Courses course1 = new Courses();
		course1.setId(2);
		course1.setName(".Net");
		course1.setCourseInstructor(instructor);
		course1.setCategory(category1);
		course1.setCourseImageLink("https://www.kodlama.io/image1.jpg");
		course1.setCourseStatus("%49");
		course1.setPrice(100);
		courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course1);
		// courseManager.delete(course);
		// courseManager.update(course);

	}

}
