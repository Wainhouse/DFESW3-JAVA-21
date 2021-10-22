package com.qa.main;

public class TropicBirds extends Birds {
	
	private String habitat;
	private String call;
	
	public TropicBirds(String region, int wingSpan, boolean migratory, String habitat, String call) {
		super(region, wingSpan, migratory);
		this.habitat = habitat;	
		this.call = call;
	}
	
	public void eatFish() {
		System.out.println("Swoop, eat flying fish");
		
	}
	
	public void plumage() {
		System.out.println("Plumage is white");
	}
	
	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
}
