package com.hibernate.onetoone;

import javax.persistence.*;

@Entity(name="Devices") // entity work as know the compiler as this is a table
public class Laptop {

	@Id	// id annotation work as a primary key
	private int lid;
	private String l_model;
	@OneToOne		// it declare the type of mapping
	@JoinColumn(name="student_Id")
	private Student student;

	// getter and setter
	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getL_model() {
		return l_model;
	}

	public void setL_model(String l_model) {
		this.l_model = l_model;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	// constructor with parameter
	public Laptop(int lid, String l_model, Student student) {
		super();
		this.lid = lid;
		this.l_model = l_model;
		this.student = student;
	}

	//default constructor
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
