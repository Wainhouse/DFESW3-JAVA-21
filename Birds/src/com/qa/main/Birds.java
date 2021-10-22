package com.qa.main;

public class Birds {
	
	// Fields
		private int weight;
		private String region;
		private String diet;
		private boolean flight;
		private int wingSpan; 
		private boolean migratory;
		
		public void makeNoise() {
			System.out.println("Kakaw!");
		}
		
		// Getters and Setters
		public String region() {
			return region;
		}
		public void setregion(String region) {
			this.region = region;
		}
		public int getWingSpan() {
			return wingSpan;
		}
		public void setWingSpan(int wingSpan) {
			this.wingSpan = wingSpan;
		}
		public boolean isMigratory() {
			return migratory;
		}
		public void setMigratory(boolean migratory) {
			this.migratory = migratory;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public String getDiet() {
			return diet;
		}

		public void setDiet(String diet) {
			this.diet = diet;
		}

		public boolean isFlight() {
			return flight;
		}

		public void setFlight(boolean flight) {
			this.flight = flight;
		}
		
	// Constructor 
//		public Birds(String region, int wingSpan, boolean migratory) {
//			super();
//			this.region = region;
//			this.wingSpan = wingSpan;
//			this.migratory = migratory;
//				}	
//	
	
}
