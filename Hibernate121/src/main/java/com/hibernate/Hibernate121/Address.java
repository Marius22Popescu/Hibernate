package com.hibernate.Hibernate121;

import javax.persistence.*;
@Embeddable
@Entity
@Table(name="ADDRESS")
public class Address {
	
	@Id
	@GeneratedValue
	@Column(name = "ADDRESS_ID")
	private long id;
	
	@Column(name = "STREET")
	private String street;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "COUNTRY")
	private String country;
	
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Student student;
	
	public Address() {}

	public Address(String street, String city, String country) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", country=" + country + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}