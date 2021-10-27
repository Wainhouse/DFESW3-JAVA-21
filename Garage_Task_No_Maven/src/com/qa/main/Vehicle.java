package com.qa.main;

public class Vehicle {

	private String make;
	private int weight;
	private int numberOfSeats;
	private int speed;
	private int noOfWheels;
	private int iD;
	private boolean damaged;

	public Vehicle(String make, int weight, int numberOfSeats, int speed, int noOfWheels, int iD, boolean damaged) {
		super();
		this.make = make;
		this.weight = weight;
		this.numberOfSeats = numberOfSeats;
		this.speed = speed;
		this.noOfWheels = noOfWheels;
		this.iD = iD;
		this.damaged = damaged;
	}


	public void turnOnEngine() {
		
		System.out.println("Bruum bruum!");
	}
	
	public float calcBill() {
		
		float totalBill = 150;
		
		if (damaged = true) {
			totalBill += 250;
		}
		return totalBill;
	
	}
		
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public boolean isDamaged() {
		return damaged;
	}

	public void setDamaged(boolean damaged) {
		this.damaged = damaged;
	}
	
}
	

	
	
	
	
	
	
	
	
	
//	Garage Task
//	The task is to create a garage class with methods for the following:
//	- Adding Vehicles to garage
//	- Removing vehicles
//	- Updating vehicles
//	- Reading vehicle
//	- Removing all vehicles
//	- Running vehicle.fixVehicle() custom method
//	Vehicles
//	Vehicle should be a base class (parent) with at least 3 fields
//	and a fixVehicle() method
//
//	You should create at least 3 child classes extending off of Vehicle 
//	(car, bike, helicopter)
//	Each child class should inherit the fields AND have 2 specific fields


