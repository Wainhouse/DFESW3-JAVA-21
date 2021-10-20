package com.qa.blackjack;

public class Exercises {

	
	public static int blackjack(int a, int b) {
		
		  if (a <= 21 && b <= 21) {
			  return Math.max(a, b);
		  }
		  
		  if (a <= 21) {
			  return a;
		  }
		  
		  if (b <= 21) {
			  return b;
		  }
		  
		  return 0;
		}
	
	
	// highest card under 21 wins under 21 or equal to 21
	
	
	public static int uniSum(int x, int y, int z) {
		
		if ( x == y || x == z ) {
			return y + z;
		}
		else if ( y == x || y == z ) {
			return x + z;
		}
		else if ( z == y || z == x ) {
			return y + x;
		}
		else if (z == y && x == z && y == x) {
			return 0;
		} else {
			return x + y + z;
		}
	}
	
	public static String fizzBuzz(int z) {
		
		if (z % 3 == 0 && z % 5 == 0) {
			return "FizzBuzz";
		} 
		else if (z % 5 == 0) {
			return "Buzz";
		}
		else if (z % 3 == 0) {
			return "Fizz";
		} else {
			return "No FizzBuzz";
		}
	}
	
	
}



