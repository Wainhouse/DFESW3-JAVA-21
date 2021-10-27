package com.qa.main;

public class Car extends Vehicle{

	private int doors;
	private int mileage;
	
		public Car(String make, int weight, int numberOfSeats, int speed, int noOfWheels, int iD, boolean damaged, int doors, int mileage) {
		super(make, weight, numberOfSeats, speed, noOfWheels, iD, damaged);
		
	}

		public int getDoors() {
			return doors;
		}

		public void setDoors(int doors) {
			this.doors = doors;
		}

		public int getMileage() {
			return mileage;
		}

		public void setMileage(int mileage) {
			this.mileage = mileage;
		} 
}
