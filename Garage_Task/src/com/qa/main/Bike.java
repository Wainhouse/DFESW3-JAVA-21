package com.qa.main;

public class Bike extends Vehicle{
	
	
	private int milage;
	private boolean sportBike;
	
	
	public Bike(String make, int weight, int numberOfSeats, int speed, int noOfWheels, int iD, boolean damaged, int milage, boolean sportBike) {
		super(make, weight, numberOfSeats, speed, noOfWheels, iD, damaged);
		
	}
	
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public boolean isSportBike() {
		return sportBike;
	}
	public void setSportBike(boolean sportBike) {
		this.sportBike = sportBike;
	}
	
}
