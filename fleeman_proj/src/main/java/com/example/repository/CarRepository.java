package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entities.Car;

import jakarta.transaction.Transactional;

public interface CarRepository extends JpaRepository<Car,Integer>{
	
	@Query("SELECT c FROM Car c WHERE c.hub.Hub_id = :hub_id")   // not in need now
	  List<Car> findAllCarsByHubId(@Param("hub_id") int hub_id);
	  
	@Modifying
	@Transactional
	 @Query("UPDATE Car c SET c.is_available = :isAvailable WHERE c.Car_id = :carId")
	    void updateCarAvailability(int carId, boolean isAvailable);

}
