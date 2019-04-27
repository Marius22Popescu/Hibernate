package com.hibernate.Hibernate1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name="stud")
public class Student {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stdId;
	@Column(name="student_name")
	private String stdName;
	
	public Student(String stdName, String stdAddress) {
		super();
		this.stdName = stdName;
		this.stdAddress = stdAddress;
	}
	@Column(name="student_address")
	private String stdAddress;
	
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdAddress() {
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}
	public Student(int stdId, String stdName, String stdAddress) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAddress = stdAddress;
	}
}
