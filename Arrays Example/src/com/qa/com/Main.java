package com.qa.com;

import java.util.Arrays;

public class Main {

	public static void name(String[] args) {
		int [] [] numbers = { { 1, 2, 3}, {4, 5, 6} };
 		System.out.println(Arrays.deepToString(numbers));
	}
	
	// Constants cannot be changed add final to the variable and make the variable name UPPERCASE
	public static void main(String[] args) {
		final float PI =3.14F;
	}
	
	//Order of Operation
	// * complies first. If you want the + compiled first ad ().
	public static void name() {
		int x = 10 + 3* 2; 
		System.out.println(x);
	}
	
	
}
