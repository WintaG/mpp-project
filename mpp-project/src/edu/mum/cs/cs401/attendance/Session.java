package edu.mum.cs.cs401.attendance;

import java.time.LocalDate;

public class Session {
	long id;
	LocalDate date;
	TimeSlot timeSlot;
	CourseOffering courseOffering;

	public Session(long id, LocalDate date, TimeSlot timeSlot, CourseOffering courseOffering) {
		this.id = id;
		this.date = date;
		this.timeSlot = timeSlot;
		this.courseOffering = courseOffering;
	}

	public long getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public TimeSlot getTimeSlot() {
		return timeSlot;
	}

	public CourseOffering getCourseOffering() {
		return courseOffering;
	}

}
