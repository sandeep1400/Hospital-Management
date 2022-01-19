package com.frontend.HospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frontend.HospitalManagement.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>{
	
	public Doctor findByName(String name);
}
