package com.qa.main;

import java.util.ArrayList;

public class Garage {

	
	public ArrayList<Vehicle> garage = new ArrayList<>();
	
	public void addVehicle(Vehicle x) {
	
		garage.add(x);
		System.out.println(x.getMake() + " has been added to the garage");
	}
	
	public void removeVehicle(String Make) {
		
		int i = 0;
		
		for(Vehicle x : garage) {
			if (x.getMake() == Make) break;
			i++;
			}
			garage.remove(i);
		
			listVehicles();

	}
	
	public void listVehicles() {
		
		for(Vehicle x: garage ) {
			
			System.out.println(x.getMake());
		}
		
	}
	
	public void fixVehicle(Vehicle x) {
		System.out.println("Total charges = " + x.calcBill());
		
		
	}
	
	public void clearVehicles() {
		
		garage.clear();
		System.out.println("Your garage is clear!");
		
	}
		
}