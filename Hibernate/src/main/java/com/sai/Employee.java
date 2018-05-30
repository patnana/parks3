package com.sai;

import javax.persistence.*;

@Entity
@Table(name="emp_hib")
public class Employee {
	@Id // annotation 1
	private int empid;
	@Column(name = "emp_name")
	private String empname;
	@Column(name = "emp_sal")
	private int empsal;

	public Employee(int empid, String empname, int empsal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}
	
	

}
