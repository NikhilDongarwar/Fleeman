package com.example.controllers;

import com.example.entities.Registration;
import com.example.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class RegistrationController {
	@Autowired
    private  RegistrationService registrationService;

    
   

	@GetMapping("/api/register/{emailId}/{password}") 
    public Registration getUserByEmailIdAndPass(@PathVariable String emailId, @PathVariable String password) {
        var temp = registrationService.getUserByEmailIdAndPass(emailId, password);
      System.out.println(temp); 
    	return temp;  
    } 
	
	@PostMapping("/api/registrations")
   public ResponseEntity<Registration> createRegistration(@RequestBody Registration registration) {
		System.out.println(registration.getLicenseValidupto()); 
        return ResponseEntity.ok(registrationService.saveRegistration(registration));
    }

}
