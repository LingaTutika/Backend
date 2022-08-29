package com.Linga.Scholar.mode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Scholar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer applycationId;
    private String firstname;
    private String lastname;
    private String email;
    private Long phonenumber;
    private String collegename;
    private String classname;
    private Long rollnumber;
    public Long getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(Long rollnumber) {
		this.rollnumber = rollnumber;
	}
	private String Address;
    private String state;
	public Integer getApplycationId() {
		return applycationId;
	}
	public void setApplycationId(Integer applycationId) {
		this.applycationId = applycationId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
    
}
