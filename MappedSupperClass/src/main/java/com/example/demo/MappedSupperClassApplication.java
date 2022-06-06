package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Tank;
import com.example.demo.model.Truck;
import com.example.demo.repository.TankRepository;
import com.example.demo.repository.TruckRepository;
import com.example.demo.repository.VehicleRepository;

@SpringBootApplication
public class MappedSupperClassApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(MappedSupperClassApplication.class, args);
		
		VehicleRepository tankRepository = configurableApplicationContext.getBean(TankRepository.class);
		VehicleRepository truckRepository = configurableApplicationContext.getBean(TruckRepository.class);
		
		Tank myTank = new Tank("sp1", 8, 1000);
		
		Truck myTruck = new Truck("sp2", 9, 1000, true);
		
		tankRepository.save(myTank);
		
		truckRepository.save(myTruck);
	}

}
