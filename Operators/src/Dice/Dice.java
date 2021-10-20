package Dice;

import java.util.Random;

public class Dice {
	
	
	public static int ThreeSDice() {
		// The code for a 3 roll
				Random rand = new Random(); //instance of a RD class
				int limit = 3;
				int int_random = rand.nextInt(limit) + 1; 
				return int_random;
	}
		
	public static int FourSDice() {
		// The code for a 4 roll
				Random rand = new Random(); //instance of a RD class
				int limit = 4;
				int int_random = rand.nextInt(limit) + 1; 
				return int_random;
	}
	
	public static int SixSDice() {
		// The code for a 6 roll
				Random rand = new Random(); //instance of a RD class
				int limit = 6;
				int int_random = rand.nextInt(limit) + 1; 
				return int_random;
	}
	
	public static int EightSDice() {
		// The code for a 8 roll
				Random rand = new Random(); //instance of a RD class
				int limit = 8;
				int int_random = rand.nextInt(limit) + 1; 
				return int_random;
	}
	
	public static int TenSDice() {
		// The code for a 10 roll
				Random rand = new Random(); //instance of a RD class
				int limit = 10;
				int int_random = rand.nextInt(limit); 
				return int_random;
	}
	
	public static int FourSix() {
		// The code for a 10 roll
		int dice1 = Dice.SixSDice();
		int result = (dice1 * 4);
		return result;
		
}
	public static int TwoTen() {
		// The code for a 10 roll
		int dice1 = Dice.TenSDice();
		int dice2 = Dice.ThreeSDice();
		int result = (dice1 *2)+(dice2*2);
		
		return result;
	}
	
	public static int FourFourSix() {
		// The code for a 10 roll
		int dice1 = Dice.SixSDice();
		int dice2 = Dice.SixSDice();
		int dice3 = Dice.SixSDice();
		int dice4 = Dice.SixSDice();
		int[] rolls = {dice1, dice2, dice3, dice4};
		int lowest = rolls [0];
		
		for (int i = 0; i < rolls.length; i++)
			
			if(lowest > rolls[i]) 
		    {
			
		    }
		return lowest;
	}
}