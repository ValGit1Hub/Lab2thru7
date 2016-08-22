package LabWork;

import java.util.Scanner;

public class GroupLab6 {

	public static void main(String[] args) {
		// Pig Latin project
		// Define variable
		Scanner scan1 = new Scanner(System.in);
		String userInput;
		String translatedWord;
		char firstLetter;

		System.out.println("Please enter a word: ");
		userInput = scan1.nextLine().toLowerCase();
		//translatedWord = 
		
		
		
		firstLetter = userInput.charAt(0);
		
		//System.out.println(firstLetter);
		
		translatedWord = userInput.substring(1) + firstLetter + "ay";
		
		
		if (firstLetter=='a'||firstLetter=='e'||firstLetter=='i'||firstLetter=='o'||firstLetter=='u'){
		System.out.println(userInput+"way");	
		}
		else{
	
			System.out.println(translatedWord);
		}

		scan1.close();
	}

}
