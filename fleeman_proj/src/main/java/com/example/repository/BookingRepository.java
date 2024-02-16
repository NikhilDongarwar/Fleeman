package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>
{
	
}
