package LabWork;

import java.util.Scanner;

public class LabNum2 {

	public static void main(String[] args) {
		//define variables
		String fork = "CHOICE";
		boolean play = true;
		String name= "";
		String occasion = "";
		String flavor = "";
		String frosting = "";
		String decor = "";
		String choice = "";
		Scanner scan1 = new Scanner(System.in);
		
		//ask for name
		System.out.println("Welcome! Please enter your name: ");
		name = scan1.nextLine();
		
		//create process loop
		while(play){
			//using switch to play
			switch(fork){
			case "CHOICE":
				//prompt user to enter which flavor they would like
				System.out.println("Would you like to build a cake? (Y / N)");
				choice = scan1.nextLine();
				if (choice.equalsIgnoreCase("y")){
					fork = "OCCASION";
				}	
				else
				{
					play = false;
					System.out.println("Sorry. No Cake for you!");
				}
				break;
			case "OCCASION":
				//prompt user to enter the occasion
				System.out.println("Is this for your BIRTHDAY or JUST BECAUSE");
				occasion = scan1.nextLine();
				fork = "FLAVOR";
				break;
			case "FLAVOR":
				//prompt user to enter which flavor they would like
				System.out.println("Would you like CHOCOLATE or VANILLA?");
				flavor = scan1.nextLine();
				fork = "FROSTING";
				break;
			case "FROSTING":
				//prompt user to enter which flavor icing they would like
				System.out.println("Would you like BUTTERCREAM, WHIPPED CREAM or FONDANT icing?");
				frosting = scan1.nextLine();
				fork = "DECOR";
				break;
			case "DECOR":
				//prompt user for preferred decor
				System.out.println("Would you like FLOWERS, PIPING or SPRINKLES?");
				decor = scan1.nextLine();
				//scan1.nextLine();
				fork = "CONGRATULATIONS";
				break;
			case "CONGRATULATIONS":
				//end the game and present the cake the user built
				System.out.println("You built a " + occasion + " cake, " + name + "! You've built a " + flavor + " cake with " + frosting + " icing and " + decor + ". Enjoy!");
				play = false;
				break;
			default:
				break;
			}
		}
		scan1.close();
		
	}

}
