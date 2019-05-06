package com.hibernate.FLC;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept")
public class Department {
	@Id @GeneratedValue
	private int detId;
	@Column(name="dept_name")
	private String deptName;
	
	public int getDetId() {
		return detId;
	}
	public void setDetId(int detId) {
		this.detId = detId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Department() {}
	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}
}
