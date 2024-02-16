package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Cartype;
import com.example.repository.CarTypeRepository;

@Service
public class CarTypeService {
	
	@Autowired
	private CarTypeRepository carrepository;
	
	public List<Cartype> getAllcarType(){
		
		return carrepository.findAll();
		
	}
	
	public List<Cartype> getCarTypesbyhubId(int hub_id){
		 return carrepository.findAllByHubId(hub_id);
	}

}
