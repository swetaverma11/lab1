package com.travellbooking.domain;

public class Main {

	public static void main(String[] args) {
		TrainTicket trainTicket1 = new TrainTicket (123456L, "Goa", "Delhi", 1200 ,"2-PM","7-AM",1,5,25);
		trainTicket1.upgrade();
		trainTicket1.getTicketDetails(1200);
		trainTicket1.cancel();
		
		/*
		System.out.println(trainTicket1.getCarriageNumber());
		System.out.println(trainTicket1.getSeatNumber());
		System.out.println(trainTicket1.getBookingRef());
		System.out.println(trainTicket1.getArrivalTime());
		*/
		
		
	}

}
