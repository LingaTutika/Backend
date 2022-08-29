package com.Linga.Student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.GeneratorType;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer StudentId;
	private String  Name;
	private String  Email;
	//private String  Password;
	private Long    PhoneNumber;
	public Integer getStudentId() {
		return StudentId;
	}
	public void setStudentId(Integer studentId) {
		StudentId = studentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	/*public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}*/
	public Long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	

}
