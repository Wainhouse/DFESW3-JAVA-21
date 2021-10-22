package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		TropicBirds redBilledTropicbird = new TropicBirds("Central Atlantic", 99, false, "Neo Tropics", "Shreek");
		Fowl chicken = new Fowl("UK", 60, false);
		
		redBilledTropicbird.eatFish();
		chicken.getEggs();
		
		System.out.println(chicken.getWingSpan());
		System.out.println(redBilledTropicbird.getHabitat());
	}
}
