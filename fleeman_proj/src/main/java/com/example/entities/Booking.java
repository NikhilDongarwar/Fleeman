package com.example.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int bookingId; 

	private String start_date;
	private String end_date;
	
	private int regId;
	
	
    public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	private int hub_id;
	public int getHub_id() {
		return hub_id;
	}

	public void setHub_id(int hub_id) {
		this.hub_id = hub_id;
	}



	private int car_id;
	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}


	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	private double estamount;
	
	
	public double getEstamount() {
		return estamount;
	}

	public void setEstamount(double estamount) {
		this.estamount = estamount;
	}

	
	
	
	
	
		
}