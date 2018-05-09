package edu.mum.cs.cs401.attendance;

import java.util.ArrayList;
import java.util.List;

public class Course {
	long id;
	String courseId;
	String name;
	String description;
	List<CourseOffering> courseOffering;

	public Course(long id, String courseId, String name, String description) {
		this.id = id;
		this.courseId = courseId;
		this.name = name;
		this.description = description;
		courseOffering = new ArrayList<>();
	}

	public long getId() {
		return id;
	}

	public String getCourseId() {
		return courseId;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public List<CourseOffering> getCourseOffering() {
		return courseOffering;
	}

}
