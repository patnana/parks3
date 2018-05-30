package com.sai;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name ="Student_batch")
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "Student_id")
	private long id;
	@Column(name = "First_name")
	private String firstname;
	@Column(name = "Last_name")
	private String lastname;
	@Column(name = "Course")
	private String section;
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Address address;
	public Student(String firstname, String lastname, String section) {
		super();
		//this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.section = section;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", section=" + section
				+ ", address=" + address + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
