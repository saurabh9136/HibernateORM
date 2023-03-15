package com.project.employee;

import java.util.*;
import javax.persistence.*;

@Entity (name="Employees") // table annotation
public class Emp {

	@Id 		//primary key
	private int eid;
	private String ename; 
	
	
	@ManyToMany 	
	@JoinTable(
	        name = "Employee_Project", 
	        joinColumns = { @JoinColumn(name = "employee_id") }, 
	        inverseJoinColumns = { @JoinColumn(name = "project_id") }
	 )
	private List<Proj> proj;

	//getter & SETTER
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

	public List<Proj> getProj() {
		return proj;
	}

	public void setProj(List<Proj> proj) {
		this.proj = proj;
	}

	//constructor with parameter
	public Emp(int eid, String ename, List<Proj> proj) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.proj = proj;
	}

	
	public Emp() {
		super();
		
	}
	
}
