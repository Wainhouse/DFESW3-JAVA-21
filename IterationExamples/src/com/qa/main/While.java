package com.qa.main;

public class While {

	// Iteration allows you to repeat blocks of code
	// Until a specific condition is met
	
	// Within Java there are 4 basic types of loop 
	
	// While - Run until a boolean condition is met
	// Do While - Runs once first THEN checks the boolean condition 
	
	// For Loop - Run a predetermined (numerically) amount of iterations
	
	// Switch - In between conditionals and loops, replaces a nesting if else statement and loops the code
	
//	Task - Create a new class and method that do the following:
//
//		- Using a while loop start with a beginning total (300), subtract an amount of money from it (45) until the total goes less than another value (87)
//
//		When the total goes below the set value, print out "You're spending too much money!"
	
	public static String moneyTooLow() {
	
		int counter = 300;
		
		
		while( counter > 87) {
			
			counter = (counter- 45);
			System.out.println(counter);
			
			if (counter < 87) {
				System.out.println("You're spending too much money!");
			}
			
		}
		return null;
		
	}
	
}
