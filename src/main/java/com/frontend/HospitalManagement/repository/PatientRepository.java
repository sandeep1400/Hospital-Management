package com.frontend.HospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frontend.HospitalManagement.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{
	
	
}
