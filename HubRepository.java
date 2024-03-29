package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Hub;

@Repository
public interface HubRepository extends JpaRepository<Hub,Integer> {
	
	List<Hub> findByCity_CityId(int cityId);


}
