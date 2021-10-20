package com.qa.main;

import java.util.Random;

public class MethodStack {

	
	
	// This method will return a number to main
	public static int firstLayer() {
		
		int result = 0;
		return result;
	}
	// This method will provide a random number for first letter to use
	public static int secondLayer() {
		
		int result = new Random().nextInt(8);
		return result;
	}
	
}
