package com.project.employee;

import java.util.List;

import javax.persistence.*;

@Entity(name="Projects")
public class Proj {

	@Id
	private int pid;
	private String pname;
	
	@ManyToMany (mappedBy="proj")
	private List<Emp> employee;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Emp> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Emp> employee) {
		this.employee = employee;
	}

	public Proj(int pid, String pname, List<Emp> employee) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.employee = employee;
	}

	public Proj() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
