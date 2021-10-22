package com.qa.com;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

	// Arrays within Java are collections of data
		// Arrays can only contain one data type Strings, ints, booleans, objects 
		// Arrays are immutable - can't be changed once they're created
		// You can change the VALUES but can't change the data type OR the length 
		
		// Arrays in Java = Train, you can change the customers getting on and off
		// but you can't change the length of the train or type of cargo mid journey
		
		public static void arrayDemo() {
			
			// When creating arrays you need to use [] to denote its an array
			// Curly {} brackets surrounding values, commas seperating values
			
			String colour = "Red";
			String[] colourList = {"Blue", "Purple", "Teal", "Yellow"}; 
			
			System.out.println(colour);
			System.out.println("=======================");
			System.out.println(colourList);
			System.out.println(colourList[1]);
			
			// For loop to access our colours
			// Accessing the length of our array with .length
			
			for(int i = 0; i < colourList.length; i++) {
				System.out.print(colourList[i] + " ");
				// run data in a different method
				// push the data to a different class
			}
			
			
			// How to manipulate our values 
			// colourList[1] = "Purple
			
			colourList[1] = "Moave";
			System.out.println();
			System.out.println(colourList[1]);
			
			
			// printing out an array without using a for loop
			String stringArrayPrint = Arrays.toString(colourList);
			
			System.out.println(stringArrayPrint);
			
			
		}
		
		public static int[] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		public static int[] numList2 = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3,};
		public static int[] numList3 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
//		public static int ArrayEx () { 
//			
//			for(int i = 0; i < numList.length; i++) {
//				
//				System.out.println(numList[i] * numList[i]);
//				
//			}
//			// create a second for loop which puts the squared array here
//			for(int i = 9; i <numList2.length; i--) {
//				
//				numList2[i] = numList[i]*i;
//				
//						System.out.println(numList2[i] + " ");
//						
//			}
//			
//			return 0;
//
//		}
		
			public static int backArrayEx () { 
		
			
			for(int i = 0; i < numList.length; i++) {
				
				System.out.println(numList[i] * numList[i]);
			}
			
			// create a second for loop which puts the squared array here
			
			for(int i = 0; i <numList2.length; i++) {
				
				numList2[i] = numList[i]*i; {
					
					if (i == 0) {
				
				    break;}
					
				}
				
				System.out.println(numList2[i]);
			}
			
			
			return 0;
		}
			
		public static ArrayList<String> doneOrders = new ArrayList<>();
		public static ArrayList<String> orders = new ArrayList<>();
		
		public static void setupArray() {
			orders.add("Espresso");
			doneOrders.add("Italian");
			doneOrders.add("Flat White");
		}
			
		public static void addCoffee() {
			
			orders.add("Italian");
			
			System.out.println(orders);
			 
			}

			
}