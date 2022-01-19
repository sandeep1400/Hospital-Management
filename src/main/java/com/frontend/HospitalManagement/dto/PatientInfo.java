package com.frontend.HospitalManagement.dto;

import java.util.Date;

import javax.persistence.Entity;

public class PatientInfo {
	private String name;
	private int age;
	private Date dateOfVisit;
	private String doctorName;
	
	public PatientInfo() {}
	
	public PatientInfo(String name, int age, Date dateOfVisit, String doctorName) {
		super();
		this.name = name;
		this.age = age;
		this.dateOfVisit = dateOfVisit;
		this.doctorName = doctorName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDateOfVisit() {
		return dateOfVisit;
	}

	public void setDateOfVisit(Date dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	
	

}
