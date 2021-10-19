package com.qa.main;

public class Calculator {

//	Operators 
//	Add      +
//	Sub      -
//	Divide   /
//	Multiply *
//  Modulus  %
	
	public static int divideMethod() {
		int result = 10/3;
		return result;
	}
	
	public static int addNums(int num1, int num2) {
		//int result = 5 + 5;
		int result = num1 + num2;
		return result;
	}
	
	public static int minNums(int num1, int num2) {
		//int result = 5 + 5;
		int result = num1 - num2;
		return result;
	}
	
	public static int divNums(int num1, int num2) {
		//int result = 5 + 5;
		int result = num1 / num2;
		return result;
	}
	
	public static int multiNums(int num1, int num2) {
		//int result = 5 + 5;
		int result = num1 * num2;
		return result;
	}
	
	public static int sqNums(int num1) {
		//int result = 5 + 5;
		int result = num1 * num1;
		return result;
	}
	
	public static int cbNums(int num1) {
		//int result = 5 + 5;
		int result = num1 * num1 * num1;
		return result;
	}
	
	public static int toThePower(int num1, int num2) {
		//int result = 5 + 5;
		int result = (int) Math.pow(num1, num2);
		return result;
	}
	
	
	
	
}
