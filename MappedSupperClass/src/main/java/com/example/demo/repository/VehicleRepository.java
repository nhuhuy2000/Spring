package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


import com.example.demo.model.Vehicle;

@NoRepositoryBean
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
	
}
