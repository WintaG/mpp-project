package edu.mum.cs.cs401.attendance;

public class Registration {
	long id;
	double GPA;
	Student student;
	CourseOffering courseOffering;

	public Registration(long id, double GPA, Student student, CourseOffering courseOffering) {
		this.id = id;
		this.GPA = GPA;
		this.student = student;
		this.courseOffering = courseOffering;
	}

	public long getId() {
		return id;
	}

	public double getGPA() {
		return GPA;
	}

	public Student getStudent() {
		return student;
	}

	public CourseOffering getCourseOffering() {
		return courseOffering;
	}

}
