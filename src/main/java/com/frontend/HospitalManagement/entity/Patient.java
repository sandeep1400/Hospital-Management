package com.frontend.HospitalManagement.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int age;
	
	private Date dateOfVisit;
	@ManyToOne
	private Doctor doctor;
	
	public Patient() {}
	
	public Patient(String name, int age, Date dateOfVisit) {
		super();
		this.name = name;
		this.age = age;
		this.dateOfVisit = dateOfVisit;
	}
	
	
	public Patient(String name, int age, Date dateOfVisit, Doctor doctor) {
		super();
		this.name = name;
		this.age = age;
		this.dateOfVisit = dateOfVisit;
		this.doctor = doctor;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

}
