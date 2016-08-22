package LabWork;

import java.util.Random;
import java.util.Scanner;

public class LabNum5 {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		String choice = "y";
		
		

		while (choice.equalsIgnoreCase("y"))
		{
			int diceSize = 0;
			String roll = "";
			//get dice size from user
			System.out.println("Welcome to the Grand Circus Casino!  ");
			System.out.println("What size dice would you like to use? : ");
			diceSize = scan1.nextInt();
			scan1.nextLine();
			
			System.out.println("Roll the dice?(y/n):");
			roll = scan1.nextLine();
			//process the roll of the dice
			if(roll.equalsIgnoreCase("y"))
			{
				Random rand = new Random(); 
				System.out.println("Roll of dice: ");
				int rollA = rollDice(diceSize, rand);
				int rollB = rollDice(diceSize, rand);
				System.out.println(rollA);
				System.out.println(rollB);
				if ((rollA == 1) & (rollB == 1))
				{
					System.out.println("Snake Eyes");
				}
				else if ((rollA == 6)&(rollB == 6))
				{
					System.out.println("Box Cars");
				}
				
			  }
			  else
			  {
					System.out.println("Goodbye");
			  }
			
			System.out.println("Continue Y/N: ");
	        choice = scan1.nextLine();
			}
		System.out.println("Goodbye");	
			
				
			
			
	        scan1.close();   

		}
		

 
   

	/**
	 * @param diceSize
	 * @param rand
	 * @return
	 */
	private static int rollDice(int diceSize, Random rand) {
		int value = rand.nextInt(diceSize)+1;
		return value;
	}
	
}
