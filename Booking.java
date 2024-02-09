package com.example.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int bookingId; 

	private LocalDateTime bookingDateAndTime; 

	private String firstName; 
	private String lastName; 
	@Column(unique=true)
	private String mobileNumber; 
	@Column(unique=true)
	private String emailId;
	@Column(unique=true)
	private String dLNumber;
	@Column(unique=true)
	private String aadharNo; 
	@Column(unique=true)
	private String passportNo; 
	private LocalDateTime startDate; 
	private LocalDateTime endDate; 
	private double estamount;
	
	
	public double getEstamount() {
		return estamount;
	}

	public void setEstamount(double estamount) {
		this.estamount = estamount;
	}

	
	
	
	
	
	private int pickupHubId; 
	
	private int dropHubId; 
	
	//private CarCategory category;

	public int getPickupHubId() {
		return pickupHubId;
	}

	public void setPickupHubId(int pickupHubId) {
		this.pickupHubId = pickupHubId;
	}

	public int getDropHubId() {
		return dropHubId;
	}

	public void setDropHubId(int dropHubId) {
		this.dropHubId = dropHubId;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDateTime getBookingDateAndTime() {
		return bookingDateAndTime;
	}

	public void setBookingDateAndTime(LocalDateTime bookingDateAndTime) {
		this.bookingDateAndTime = bookingDateAndTime;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getdLNumber() {
		return dLNumber;
	}

	public void setdLNumber(String dLNumber) {
		this.dLNumber = dLNumber;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	
	
	


	//	public int getPickupHubId() {
//		return pickupHubId;
//	}
//
//	public void setPickupHubId(int pickupHubId) {
//		this.pickupHubId = pickupHubId;
//	}

//	public int getDropHubId() {
//		return dropHubId;
//	}
//
//	public void setDropHubId(int dropHubId) {
//		this.dropHubId = dropHubId;
//	}

	
		
	
}