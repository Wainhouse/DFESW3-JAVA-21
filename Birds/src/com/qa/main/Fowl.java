package com.qa.main;

public class Fowl extends Birds{

	
	private String bird;
	private int eggs;
	private boolean Hybridization;
	
	
	
	public Fowl(String region, int wingSpan, boolean migratory) {
		super(region, wingSpan, migratory);
		this.getBird();
		this.getEggs();
		Hybridization = isHybridization();
		
	}
	
	public void layEggTime() {
			System.out.println("LayEgg");
		
	}
	
	public void fightTime() {
		System.out.println("Fight");
	}


	public String getBird() {
		return bird;
	}



	public void setBird(String bird) {
		this.bird = bird;
	}



	public boolean isHybridization() {
		return Hybridization;
	}



	public void setHybridization(boolean hybridization) {
		Hybridization = hybridization;
	}




	public int getEggs() {
		return eggs;
	}


	public void setEggs(int eggs) {
		this.eggs = eggs;
	}
	
}
