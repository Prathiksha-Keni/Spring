package com.xworkz.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

	private String name;
	private int regNo;
	private int phoneNo;
	private int age;
	private String emailId;
	private Address address;

	public String getName() {
		return name;
	}

	@Value("prathiksha")
	public void setName(String name) {
		this.name = name;
	}

	public int getRegNo() {
		return regNo;
	}

	@Value("45")
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	@Value("12345")
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getAge() {
		return age;
	}

	@Value("24")
	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	@Value("prathiksha@gmail.com")
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", regNo=" + regNo + ", phoneNo=" + phoneNo + ", age=" + age + ", emailId="
				+ emailId + ", address=" + address + "]";
	}

}
