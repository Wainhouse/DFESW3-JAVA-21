package com.qa.main;

public class Helicoptor extends Vehicle{

	
	private int propellorSpeed;
	private boolean paintDamage;
	
	public Helicoptor(String make, int weight, int numberOfSeats, int speed, int noOfWheels, int iD, boolean damaged, int propellorSpeed, boolean paintDamage) {
		super(make, weight, numberOfSeats, speed, noOfWheels, iD, damaged);
		this.propellorSpeed = propellorSpeed;
		this.paintDamage = paintDamage;
	}

	public boolean paintDamage() {
		return paintDamage;
	}

	public void paintDamage(boolean paintDamage) {
		this.paintDamage = paintDamage;
	}	
	
	public int getPropellorSpeed() {
		return propellorSpeed;
	}

	public void setPropellorSpeed(int propellorSpeed) {
		this.propellorSpeed = propellorSpeed;
	}

	
}
