package com.qa.main;

public class ifStatement {
	
	

	public static void conditionalDemo() {
		
		//Java uses if else statements (like basically every programming / scripting language)
		// computing / programming is binary true / false 
		
	
	boolean isKettleOn = true;
	
//	isKettleOn = false;
		
//	if is the command word 
//	next to if within () is the statement
//	= - assignment
//	== comparison (checking the value )
	
	if (isKettleOn == true) {
		
		// is the body 
		// what the code does if the if statement is true
		
		System.out.println("I'll take milk, no sugar");
		
	} else if (isKettleOn == false) {
		
		System.out.println("Pop the kettle on!");
		
	}
	
	boolean binsOut = true;
	
	if(binsOut) {
		
		System.out.println("Bins are out!");
		
	} else { 
		
		System.out.println("Bins were forgotten");
	
		}
	}
	
	// Conditional Operators 
	// == - equals
	// > - greater than 
	// < - less than 
	// <= less than OR equal
	// >= greater than OR equal  
	// || - OR
	// && - AND
	// != - not equal
	
	// Task - Using Java IF Else create an if else stack that does the following:
	// - Prints out "Greater than" if a number is greater than 10 
	// - Prints out "Equals" if a number is equal to 10
	// - Prints out "less than" if a number is less than 10 
	
	public static String ifElse() {
	
		int num = 20;
	
		if (num > 10) {
			return "Greater Than";
		} else if (num == 10) {
			return "Equals too";
		} else {
			return "Less Than";
		}
		
	}
	
	public static void complexStatement() {
		
		
		boolean bool = true;
		String colour = "Red";
		
		// If bool is true OR colour is red
		if (bool == true || colour == "Red") {
			System.out.println("bool is true OR colour is red");
			// How can we tell which one is true?
			
			if (bool == true && colour == "Red") {
				System.out.println("Both are true");
			} else if (bool == true) {
				System.out.println("Bool is true");
			} else if (colour == "Red") { 
				System.out.println("Colour is Red");
			}
			
		}	
	}
	
}

	