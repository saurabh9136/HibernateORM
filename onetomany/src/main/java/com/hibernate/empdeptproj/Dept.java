package com.hibernate.empdeptproj;

import java.util.*;

import javax.persistence.*;

@Entity(name="Department") // set the name of table
public class Dept {

	@Id				// declaring primary key
	private int dip;
	private String dname;
	
	@OneToMany  (mappedBy="dept") // type of relation 
	List<Emp> emp;

	// getter and setters
	public int getDip() {
		return dip;
	}

	public void setDip(int dip) {
		this.dip = dip;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}
	// parameterized constructor to init object
	public Dept(int dip, String dname, List<Emp> emp) {
		super();
		this.dip = dip;
		this.dname = dname;
		this.emp = emp;
	}
	// default constructor
	public Dept() {
		super();
		
	}	
	
}
