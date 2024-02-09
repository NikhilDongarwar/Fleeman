package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Airport;

public interface AirportRepository extends JpaRepository<Airport,Integer> {

}
