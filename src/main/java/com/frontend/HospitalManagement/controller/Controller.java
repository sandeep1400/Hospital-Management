package com.frontend.HospitalManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.frontend.HospitalManagement.entity.Doctor;
import com.frontend.HospitalManagement.entity.Patient;
import com.frontend.HospitalManagement.repository.DoctorRepository;
import com.frontend.HospitalManagement.repository.PatientRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private PatientRepository patientRepository;
	
	@GetMapping("/doctors")
	public List<Doctor> ShowDoctors()
	{
		return doctorRepository.findAll();
	}
	
	@GetMapping("/doctors/{name}")
	public Doctor FindDoctor(@PathVariable String name)
	{
		return doctorRepository.findByName(name);
	}
	
	@PostMapping("/doctors")
	public Doctor CreateDoctor(@RequestBody Doctor doctor)
	{
		return doctorRepository.save(doctor);
	}
	
	@GetMapping("/patients")
	public List<Patient> ShowPatients()
	{
		return patientRepository.findAll();
	}
	
	@PostMapping("/patients")
	public Patient CreatePatients(@RequestBody Patient patient)
	{
		Doctor doctor=patient.getDoctor();
		doctor.setPatientsAttended(doctor.getPatientsAttended()+1);
		doctorRepository.save(doctor);
		return patientRepository.save(patient);
	}
	
	/*
	@GetMapping("/patientsInfo ")
	public List<PatientInfo> ShowPatientInfo()
	{
		return patientRepository.showPatientInfo();
	}
	*/

}
