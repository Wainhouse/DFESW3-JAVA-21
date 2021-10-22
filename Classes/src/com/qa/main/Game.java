package com.qa.main;

public class Game{
	
	// Fields - Attributes to describe the object
	
	public int level;
	private String tool;
	private String armour;
	public int health;
	public int energy;
	private boolean istoolActive;
	private boolean isArmourActive;
	
	// Methods - Functions that the object can do
	public void gameStart() {
		System.out.println("Begin");
	}
		
	
	public void gameOver() {
		System.out.println("You've died");
	
	}
		
	public void isToolEquip() {
		
		setIstoolActive(false);
		System.out.println("No Tool");
		
	}
		
//	public Game() {
//		
//		isArmourActive = true;
//		istoolActive = true;
//		energy = 100;
//		health = 100;
//		armour = "Gold";
//		tool = "Diamond Axe";
//		
//	}

		// I should be able to form my runner create any cake I pass the values in
	public Game(String tool, String armour, int health, int energy, boolean istoolActive, boolean isArmourActive) {
		super(); // Within Java everything is an object of something - java.lang.object object
		this.setTool(tool);
		this.setArmour(armour);
		this.health = health;
		this.energy = energy;
		this.setIstoolActive(istoolActive);
		this.setArmourActive(isArmourActive);
		
		//this. - when creating This object
	}


	public String getTool() {
		return tool;
	}


	public void setTool(String tool) {
		this.tool = "Golden Pickaxe";
	}


	public String getArmour() {
		return armour;
	}


	public void setArmour(String armour) {
		
		this.armour = "Diamond Armor";
	}


	public boolean isIstoolActive() {
		return istoolActive;
	}


	public void setIstoolActive(boolean istoolActive) {
		this.istoolActive = true;
	}


	public boolean isArmourActive() {
		return isArmourActive;
	}


	public void setArmourActive(boolean isArmourActive) {
		
		if (level < 100) { 
			System.out.println("You're not a high enough level");
		}
		
		this.isArmourActive = true;
	}
	
	

	
}
//Create a class with that name Car etc
//
//Create atleast 4 fields and 1 method (syso something..)
//
//Create a constructor with some values
//
//With your main method, create an object and syso the values and run the method