package com.frontend.HospitalManagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.frontend.HospitalManagement.controller.Controller;
import com.frontend.HospitalManagement.entity.Doctor;
import com.frontend.HospitalManagement.entity.Patient;
import com.frontend.HospitalManagement.repository.DoctorRepository;
import com.frontend.HospitalManagement.repository.PatientRepository;
@SpringBootTest
class HospitalManagementApplicationTests {

	@Autowired
	private Controller controller;
	@MockBean
	private PatientRepository patientRepository;
	@MockBean
	private DoctorRepository doctorRepository;
	@Test
	void contextLoads() {
	}
	@Test
	public void showDoctorsTest() {
		when(doctorRepository.findAll()).thenReturn(Stream
			.of(new Doctor("abc",21,"Male","Heart",(long) 60),new Doctor("xyz",30,"male","Kidney",(long) 10)).collect(Collectors.toList()));
		assertEquals(2, controller.ShowDoctors().size());
	}
	@Test
	public void showPatientsTest() {
		when(patientRepository.findAll()).thenReturn((List<Patient>) Stream
				.of(new Patient("abc",10,new Date()),new Patient("xyz",20,new Date())).collect(Collectors.toList()));
		assertEquals(2, controller.ShowPatients().size());
	}
	@Test
	public void saveDoctorTest() {
		Doctor doctor=new Doctor("abc",21,"Male","Heart",(long) 60);
		when(doctorRepository.save(doctor)).thenReturn(doctor);
		assertEquals(doctor, controller.CreateDoctor(doctor));
	}
	@Test
	public void savePatientTest() {
		Patient patient=new Patient("abc",10,new Date(),new Doctor("abc",21,"Male","Heart",(long) 60));
		when(patientRepository.save(patient)).thenReturn(patient);
		assertEquals(patient, controller.CreatePatients(patient));
	}
	
	

}
