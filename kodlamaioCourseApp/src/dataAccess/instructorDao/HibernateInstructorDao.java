package dataAccess.instructorDao;

import dataAccess.InstructorDao;
import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen hibernate İle eklenmiştir. " + instructor.getFirstName() + " " + instructor.getLastName());
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Eğitmen hibernate İle güncellenmiştir. " + instructor.getFirstName() + " " + instructor.getLastName());
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Eğitmen hibernate İle silinmiştir. " + instructor.getFirstName() + " " + instructor.getLastName());
		
	}

}
