package com.example.demo.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="usersdb")
@Access(AccessType.FIELD)
public class User extends ParentEntity {


	private static final long serialVersionUID = 1L;
	
	@Column(name = "first_name", length = 255 , nullable = false)
	private String firstName; 
	
	@Column(name = "second_name", length = 255 , nullable = true)
	private String secondName;
	
	@Column(name = "first_surname", length = 255 , nullable = false)
	private String firstSurname;
	
	@Column(name = "second_surname", length = 255  , nullable = true)
	private String secondSurname;
	
	@Column(name = "phone", length = 255  , nullable = true)
	private String phone; 
	
	@Column(name = "address", length = 255, nullable = false)
	private String address;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getFirstSurname() {
		return firstSurname;
	}
	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}
	public String getSecondSurname() {
		return secondSurname;
	}
	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	} 
	
	

}
