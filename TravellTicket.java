package com.travellbooking.domain;
//create super class...
public class TravellTicket {
	public TravellTicket(long bookingRef, String origin, String destination, int price, String departureTime,
			String arrivalTime) {
		super();
		this.bookingRef = bookingRef;
		this.origin = origin;
		this.destination = destination;
		this.price = price;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}
	private long bookingRef;
	
	
	
	public long getBookingRef() {
		return bookingRef;
	}
	public void setBookingRef(long bookingRef) {
		this.bookingRef = bookingRef;
	}
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	public void cancel() {
		System.out.println("your ticket is cancel");
	}
	
	private String origin;
	private String destination;
	private int price;
	private String departureTime;
	private String arrivalTime;
	
		
	}


