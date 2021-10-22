package com.qa.com;

import java.util.ArrayList;

public class QACafe {
	
	public static ArrayList<String> doneOrders = new ArrayList<>();
	public static ArrayList<String> orders = new ArrayList<>();
	
	public static void addCoffee() {
		
		orders.add("Italian");
		orders.add("Flat white");
		orders.add("Tall black");
		orders.add("Medium Cappucinok");
		orders.add("Medium Strawberry Iced Tea");
		orders.add("Large Choc Cookie Frappe");
		orders.add("Tall black");
		orders.add("Large Cafe Au Lait");
		orders.add("Medium Strawberry Iced Tea");

		System.out.println(orders);
		 
		}
	
	public static void updatingDoneOrder(int index) {
		
		doneOrders.add(orders.get(index));
		
		orders.remove(index);
		
		System.out.println(doneOrders);

	}
	
	public static String returnOrderName(int ordNo) {
		
		System.out.println(orders.get(ordNo));
		
		return orders.get(ordNo);
	}
	
	public static void updateCoffee(int index) {
		orders.set(index, "Small Caramel Iced Latte");
		System.out.println(orders);

	}
	
	public static void removeOrder(int index) {
		orders.remove(index);
		System.out.println(orders);
	}
	
	public static void removeDoneOrder(int index) {
		doneOrders.remove(index);
		System.out.println(doneOrders);
	}
	
	public static void orderLength() {
		
		orders.size();
		
		System.out.println(orders.size());
		
	}
	
	public static void clearOrders() {
		
		orders.clear();
		System.out.println(orders.size());

	}
}
