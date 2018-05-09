package edu.mum.cs.cs401.attendance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TimeSlot {
	long id;
	String abbrv;
	String description;
	LocalDate beginTime;
	LocalDate endTime;
	List<AttendanceRecord> attendanceRecord;
	List<Session> session;

	public TimeSlot(long id, String abbrv, String description, LocalDate beginTime, LocalDate endTime) {
		this.id = id;
		this.abbrv = abbrv;
		this.description = description;
		this.beginTime = beginTime;
		this.endTime = endTime;
		attendanceRecord = new ArrayList<>();
		session = new ArrayList<>();
	}

	public long getId() {
		return id;
	}

	public String getAbbrv() {
		return abbrv;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getBeginTime() {
		return beginTime;
	}

	public LocalDate getEndTime() {
		return endTime;
	}

	public List<AttendanceRecord> getAttendanceRecord() {
		return attendanceRecord;
	}

	public List<Session> getSession() {
		return session;
	}

}
