package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Airport;
import com.example.services.AirportService;

@RestController
@CrossOrigin("*")
public class AirportController {
	
	@Autowired
	private AirportService airportservice;
	
	@CrossOrigin
	@GetMapping(value="api/airports")
	public List<Airport> getallAirport(){
		return airportservice.getAirport();
	}
	

}
