package com.qa.main;

public class Runner {

	
	public static void main (String[] args) {
		
		Garage GI = new Garage(); // 
								
		Vehicle HI = new Helicoptor("John Deer", 6000, 6, 250, 3, 16896, true, 4500, false);
		
		Vehicle CI = new Car("Bentley", 2000, 5, 176, 4, 78678, false, 5, 75000);
		
		Vehicle BI = new Bike("Harley Davideson", 750, 2, 190, 2, 986896, false, 60000, false);
		
		GI.addVehicle(CI);
		GI.addVehicle(CI);
		GI.addVehicle(BI);
		GI.addVehicle(HI);
		
		
		GI.fixVehicle(BI);
		GI.fixVehicle(CI);
		GI.fixVehicle(HI);
		
		GI.clearVehicles();
		
		System.out.println();
	
	}
}
