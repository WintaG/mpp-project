package edu.mum.cs.cs401.attendance;

import java.util.ArrayList;
import java.util.List;

public class Location {
	long id;
	String shortName;
	String longName;
	List<AttendanceRecord> attendanceRecord;
	List<CourseOffering> courseOffering;

	public Location(long id, String shortName, String longName) {
		this.id = id;
		this.shortName = shortName;
		this.longName = longName;
		attendanceRecord = new ArrayList<>();
		courseOffering = new ArrayList<>();
	}

	public long getId() {
		return id;
	}

	public String getShortName() {
		return shortName;
	}

	public String getLongName() {
		return longName;
	}

	public List<AttendanceRecord> getAttendanceRecord() {
		return attendanceRecord;
	}

	public List<CourseOffering> getCourseOffering() {
		return courseOffering;
	}

}
