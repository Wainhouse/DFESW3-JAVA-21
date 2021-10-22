package com.qa.main;

public class DoWhile {

		public static void basicExample() {
			
			boolean testBool = true;
			
			System.out.println("Before Loop");
			//While testBool is false testBool ==false
			while(!testBool) {
				System.out.println("Will this ever print??");
			}
			
			System.out.println("After Loop");
			
			// Do While - Will always run Once before checking the code 
			
			// do first with no condition, and a body
			// followed by our while (With a condition)
			do {
				System.out.println("print from the do while loop");
				
			} while(!testBool);
			
		}
}
