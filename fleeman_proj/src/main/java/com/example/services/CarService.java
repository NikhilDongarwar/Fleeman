package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Car;
import com.example.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	private CarRepository carrepository;
	
	public List<Car> getCarbyHubid(int hub_id){
		
		return carrepository.findAllCarsByHubId(hub_id);	}
	
	public void UpdateAvailable(int carId, boolean isAvailable) {
		
		carrepository.updateCarAvailability(carId,isAvailable);
	}
	

}
