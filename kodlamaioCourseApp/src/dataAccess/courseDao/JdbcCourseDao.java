package dataAccess.courseDao;

import dataAccess.CourseDao;
import entities.Courses;

public class JdbcCourseDao  implements CourseDao{

	@Override
	public void add(Courses course) {
		System.out.println("Kurs JDBC İle eklenmiştir. " + course.getName());
		
	}

	@Override
	public void delete(Courses course) {
		 System.out.println("Kurs JDBC İle silinmiştir. " + course.getName());
		
	}

	@Override
	public void update(Courses course) {
		System.out.println("Kurs JDBC İle güncellenmiştir. " + course.getName());
		
	}

}
