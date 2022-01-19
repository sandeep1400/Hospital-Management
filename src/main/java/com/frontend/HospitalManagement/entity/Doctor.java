package com.frontend.HospitalManagement.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "doctors")
public class Doctor {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int age;
	private String gender;
	private String specialistField;
	private Long patientsAttended;
	@OneToMany(mappedBy = "doctor")
	@JsonIgnore
	private List<Patient> patients= new ArrayList<>();
	
	public Doctor() {}
	
	public Doctor(String name, int age, String gender, String specialistField) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialistField = specialistField;
	}
	
	public Doctor(String name, int age, String gender, String specialistField, Long patientsAttended) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialistField = specialistField;
		this.patientsAttended = patientsAttended;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialistField() {
		return specialistField;
	}
	public void setSpecialistField(String specialistField) {
		this.specialistField = specialistField;
	}
	public Long getPatientsAttended() {
		return patientsAttended;
	}
	public void setPatientsAttended(Long patientsAttended) {
		this.patientsAttended = patientsAttended;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	
	

	/*public void addPatients(Patient patient) {
		this.patients.add(patient);
	}
	public void removePatients(Patient patient) {
		this.patients.remove(patient);
	}*/
}
