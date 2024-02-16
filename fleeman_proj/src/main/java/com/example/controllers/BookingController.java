package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Booking;
import com.example.services.BookingService;

@RestController
public class BookingController 
{
	@Autowired
	private BookingService bookingservice;
	
	@PostMapping("api/bookingsave")
	public void bookingSave(@RequestBody Booking booking)
	{
		bookingservice.bookingSave(booking);
	}
	
	@DeleteMapping("api/delete/{booking_id}")
	public void deleteBooking(@PathVariable int booking_id) {
		bookingservice.bookingDelete(booking_id);
	}
}
