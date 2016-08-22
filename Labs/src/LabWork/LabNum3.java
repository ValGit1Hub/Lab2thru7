package LabWork;

import java.util.Scanner;

public class LabNum3 {

	public static void main(String[] args) {
		// define variables
		int input = 0;
		String cont = "y";
		//int sqr = 2;
		//int cube = 3;
		Scanner scan1 = new Scanner(System.in);
		
		//read user data
		System.out.println("Learn your squares and cubes!");
		while(cont.equalsIgnoreCase("y")){
			System.out.println("Enter an integer: {user input here, for example:5}");
			input = scan1.nextInt();
			scan1.nextLine();
			
					
			//process data
			System.out.println("Number" +"\t" +"Square" + "\t" + "Cube"); 
			System.out.println("======" +"\t" +"======" + "\t" + "======"); 

			getPower(input);
			System.out.println("Would you like to continue?(y/n):");
			cont = scan1.nextLine();
			System.out.println("cont is: "+ cont);
			
			
			
			
		}
		
		
		System.out.println("Thanks for Playing. Goodbye!");
		scan1.close();
	}
	
	public static void getPower(int input){
				
		for(int i=1; i<=input;i++){
			//result = result * x;
			int sqr = i * i;
			int cube = i*i*i;
			System.out.println(i +"\t" +sqr + "\t" + cube);
			
			
			}
		
		
	}
 
 
}
