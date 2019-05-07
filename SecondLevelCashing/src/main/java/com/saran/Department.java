package com.saran;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept")
public class Department {
	@Id @GeneratedValue
	private int deptId;
	@Column(name="dept_name")
	private String deptName;
	
	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}
	
	public Department() {}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}
