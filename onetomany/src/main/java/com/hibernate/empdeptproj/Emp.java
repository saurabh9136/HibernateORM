package com.hibernate.empdeptproj;

import javax.persistence.*;

@Entity(name="Employee") // tabble annotation
public class Emp {

	@Id // primary key
	private int eid;
	private String ename;
	
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Dept dept;

	// getter and setters
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	// parameterized constructor to init object
	public Emp(int eid, String ename, Dept dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
	}

	// default constructor
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
