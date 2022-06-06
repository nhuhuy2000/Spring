package com.example.demo.model;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.VehicleRepository;

@Entity
public class Tank extends Vehicle {
	
	private Integer firePower;
	
	public Tank(String name, Integer seats, Integer firePower) {
		super(name, seats);
		this.firePower = firePower;
		// TODO Auto-generated constructor stub
	}

	public Tank() {
		
	}
	
	
	
	
}
