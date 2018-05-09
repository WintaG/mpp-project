package edu.mum.cs.cs401.attendance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CourseOffering {
	long id;
	String courseOfferingId;
	LocalDate startDate;
	LocalDate endDate;
	List<Registration> registration;
	List<Session> session;
	Location location;
	Course course;

	public CourseOffering(long id, String courseOfferingId, LocalDate startDate, LocalDate endDate, Location location,
			Course course) {
		this.id = id;
		this.courseOfferingId = courseOfferingId;
		this.startDate = startDate;
		this.endDate = endDate;
		registration = new ArrayList<>();
		session = new ArrayList<>();
		;
		this.location = location;
		this.course = course;
	}

	public long getId() {
		return id;
	}

	public String getCourseOfferingId() {
		return courseOfferingId;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public List<Registration> getRegistration() {
		return registration;
	}

	public List<Session> getSession() {
		return session;
	}

	public Location getLocation() {
		return location;
	}

	public Course getCourse() {
		return course;
	}

}
