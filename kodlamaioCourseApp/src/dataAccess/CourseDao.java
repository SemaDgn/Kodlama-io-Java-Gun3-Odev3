package dataAccess;

import entities.Courses;

public interface CourseDao {

	public void add(Courses course);

	public void delete(Courses course);

	public void update(Courses course);
}
