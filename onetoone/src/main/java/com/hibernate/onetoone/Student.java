package com.hibernate.onetoone;

import javax.persistence.*;

@Entity(name="Students")  // entity work as know the compiler as this is a table
public class Student {
	@Id        // id annotation work as a primary key
	private int sid;
	private String sname;
	
	@OneToOne		// it declare the type of mapping
	
	private Laptop laptop;
	
	// getter and setter
	public int getSid() {	
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	// constructor with parameter
	public Student(int sid, String sname, Laptop laptop) {
		super();
		this.sid = sid;
		this.sname = sname; 
		this.laptop = laptop;
	}
	
	//default constructor wowwa
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
