package com.sai;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "Addresss_batch")
public class Address {
@Id
@Column(name = "Address_id")
private long id;
@Column(name ="Street")
private String street;
@Column(name = "CITY")
private String city;
@Column(name ="Country")
private String country;
public Address(String street, String city, String country) {
	super();
	//this.id = id;
	this.street = street;
	this.city = city;
	this.country = country;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "Address [id=" + id + ", street=" + street + ", city=" + city + ", country=" + country + "]";
}



}
