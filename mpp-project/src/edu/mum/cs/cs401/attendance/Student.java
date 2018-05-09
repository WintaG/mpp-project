package edu.mum.cs.cs401.attendance;

import java.util.ArrayList;
import java.util.List;

public class Student {
	long id;
	String studentId;
	String firstname;
	String lastname;
	String barCode;
	List<AttendanceRecord> attendanceRecord;
	List<Registration> registration;

	public Student(long id, String studenId, String firstname, String lastname, String barCode) {
		this.id = id;
		this.studentId = studenId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.barCode = barCode;
		attendanceRecord = new ArrayList<>();
		registration = new ArrayList<>();
	}

	public long getId() {
		return id;
	}

	public String getStudenId() {
		return studentId;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getBarCode() {
		return barCode;
	}

	public List<AttendanceRecord> getAttendanceRecord() {
		return attendanceRecord;
	}

	public List<Registration> getRegistration() {
		return registration;
	}

}
