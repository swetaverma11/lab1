package com.travellbooking.domain;

public class TrainTicket extends TravellTicket{
	private int travelClass;
	private int carriageNumber;
	private int seatNumber;
	
	public TrainTicket(){
		super();
			
	}
	
	
	 TrainTicket(long bookingRef, String origin, String destination, int price, String departureTime,
			String arrivalTime, int travelClass, int carriageNumber, int seatNumber) {
		super(bookingRef, origin, destination, price, departureTime, arrivalTime);
		this.travelClass = travelClass;
		this.carriageNumber = carriageNumber;
		this.seatNumber = seatNumber;
	}
	

	public int getTravelClass() {
		return travelClass;
	}

	public void setTravelClass(int travelClass) {
		this.travelClass = travelClass;
	}

	public int getCarriageNumber() {
		return carriageNumber;
	}

	public void setCarriageNumber(int carriageNumber) {
		this.carriageNumber = carriageNumber;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	//method overloading...
	
	public void getTicketDetails(long ref){
		System.out.println("ur refrence" + ref);
		
	}
	public void getTicketDetails(long ref,int p){
		System.out.println("ur refrence" + ref);
		
	}
	
	
	//method overloading...
	public void upgrade(){
		if(travelClass != 1) {
			travelClass = 1;
			System.out.println("upgraded");
		}else {
			System.out.println("u are first class");
		}
		
	}
	

	@Override
	
	public void cancel() {
		System.out.println("your ticket got cancelation way......");
	}
	
	

}
