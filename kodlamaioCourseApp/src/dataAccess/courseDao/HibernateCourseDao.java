package dataAccess.courseDao;

import dataAccess.CourseDao;
import entities.Courses;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Courses course) {
		System.out.println("Kurs hibernate İle eklenmiştir. " + course.getName());
		
	}

	@Override
	public void delete(Courses course) {
		System.out.println("Kurs hibernate İle silinmiştir. " + course.getName());
		
	}

	@Override
	public void update(Courses course) {
		System.out.println("Kurs hibernate İle güncellenmiştir. " + course.getName());
		
	}

}
