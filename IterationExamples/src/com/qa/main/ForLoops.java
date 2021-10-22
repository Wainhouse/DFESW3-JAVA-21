package com.qa.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForLoops {

	
//	For loops have four components to configure 
//	Initialisation (initial value)
//	condition (What we're checking for)
//	Iteration (How we loop through the code)
//	Body (What code are we looping)
	
	
	public static void countToTen() {
		
		
		for (
				int i = 0; // initialisation - Starting from value 0
				i < 10;
				i++
				
				) {
		System.out.println(i);				// Body - What code we're wanting it to do 
		}
		
		
		
	}
	
	public static void coutDownFromTen() {
		
		for (
				
				int i = 10; 
				i >= 0;
				i--
				) {
			System.out.println(i);
		}
			
	}
	
	public static void countInFours() {
		
		for(int i = 5; i <123; i+=4) {
			System.out.println("Value of i is " + i);
		}
	}



//Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
//Create a second method that when given the number 1-99 returns a String representation of this number,
//for example 1 = one, 11 = eleven, 21 = twenty-one.
//Expand on the method you wrote in Numbers 2 to allow the input 1-999.
//Expand the method you wrote in Numbers 2 to allow the input 1-9999
//

	public static void ExOne() {
		
		int number = 99;
		
		while (number > 0) {
			System.out.println( number % 10);
		    number = number / 10;
		}
			 	
	}
	
//	public static String intToString(int x) {
//		
//		
//		while (x==Math.round(x)) {
//		
//			=String.valueOf(x);
//			
//			System.out.println();
//			
//		}
//		
//	}
//			
//}
// Create a method that can print out the numbers 1-10 10 times each.

	public static void printTen() {
		
		
		for ( int i = 0; i<=10; i++) {
			for ( int y  = 0; y<=10; y++) {
				System.out.println(y);	
				
				}
			}
		}

	
// If you have used a while()-loop at any point in these exercises, replace them with for()-loops.
// Remember you should use a for()-loop when you know when the iteration should end.

	


	public static float changeMethod(float price, float amountPaid) {
		
		float change = amountPaid - price;
		
		int twenty = 0;
		int tenner = 0;
		int fiver = 0;
		int twoPounds = 0;
		int onePounds = 0;
		
		while(change >= 20) {
			change -= 20;
			twenty++;
		}
		while(change >= 10) {
			change -= 10;
			tenner++;
		}
		while(change >= 5) {
			change -= 5;
			fiver++;
		}
		while(change >= 2) {
			change -= 2;
			twoPounds++;
		}
		while(change >= 1) {
			change -= 1;
			onePounds++;
		}
		 System.out.println("Number of Twenty Pound notes " + twenty);
		 System.out.println("Number of Twenty Pound notes " + tenner);
		 System.out.println("Number of Twenty Pound notes " + fiver);
		 System.out.println("Number of Twenty Pound notes " + twoPounds);
		 System.out.println("Number of Twenty Pound notes " + onePounds);
		return 0.0f;
	}
	
	public static void printNums() {
		
		
		for ( int i = 1; i< 10; i++) {
			
			for ( int y = 1; y<=i; y++) {
				System.out.println(i);	
				
				}
			}
		}
			
}



