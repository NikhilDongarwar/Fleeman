package com.example.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Pdf_demo;
import com.example.services.UserDetailsPDFService;

@RestController
public class UserDetailsController {

	@Autowired
    private  UserDetailsPDFService userDetailsPDFService;

    
    
    @PostMapping("/generatePdf")
    public ResponseEntity<byte[]> generatePdf(@RequestBody Pdf_demo userDetails) {
        byte[] bytes = userDetailsPDFService.generateUserDetailsPDF(userDetails);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=userDetails.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(bytes);
    }
}
