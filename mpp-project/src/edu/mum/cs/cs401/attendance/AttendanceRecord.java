package edu.mum.cs.cs401.attendance;

import java.util.Date;

public class AttendanceRecord {
	int id;
	Date date;
	Student student;
	Location location;
	TimeSlot timeSlot;

	public AttendanceRecord(int id, Date date, Student student, Location location, TimeSlot timeSlot) {
		this.id = id;
		this.date = date;
		this.student = student;
		this.location = location;
		this.timeSlot = timeSlot;
	}

	public int getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public Student getStudent() {
		return student;
	}

	public Location getLocation() {
		return location;
	}

	public TimeSlot getTimeSlot() {
		return timeSlot;
	}

}
