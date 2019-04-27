package com.emre;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.*;

@Entity
@Table(name="STUDENT")
public class Student {

	@Id
	@GeneratedValue
	@Column(name="STUDENT_ID")
	private long id ;
	@Column(name="FIRSTNAME")
	private String firstName;
	@Column(name="LASTNAME")
	private String lastName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="STUDENT_SUBJECT",
			joinColumns  = {@JoinColumn(name="STUDENT_ID")},
			inverseJoinColumns = {@JoinColumn(name="SUBJECT_ID")})
	
	private List<Subject> subjects = new ArrayList<Subject>();
	
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Student() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
}
