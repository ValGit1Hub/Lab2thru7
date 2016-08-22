package LabWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LabNum6 {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		String choice = "yes";
		String ending1 = "way";
		String ending2 = "ay";
		String userInput = "";
		
		System.out.println("Welcome to the Pig Latin Translator!");
		try{
		while (choice.equalsIgnoreCase("yes"))
		{
			//get user input
			System.out.println("Enter a word to be translated: ");
			userInput = scan1.nextLine();
			//convert to Lower case
		    String lCase = userInput;//remove converting to ".toLowerCase();"
		    //get first character of the word
		    char startingChar =lCase.charAt(0);
		    translateWord(ending1, ending2, userInput, lCase, startingChar);
		  //translate again?
			System.out.println("Translate another line yes/no: ");
	        choice = scan1.nextLine();
		  }
		}catch (Exception e){
			System.out.println("An Error exit!!!!" + e);
		}
		  System.out.println("Goodbye");
		
		  scan1.close();
		}

	/**
	 * @param ending1
	 * @param ending2
	 * @param userInput
	 * @param lCase
	 * @param startingChar
	 */
	private static void translateWord(String ending1, String ending2, String userInput, String lCase,
			char startingChar) {
		 Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		 Matcher matcher = pattern.matcher(userInput);
		//check for numbers or symbols in string
		if (userInput.matches(".*\\d+.*") || matcher.matches())
		{
			System.out.print("You entered "+ userInput );
			System.out.println(" we don't translate strings with numbers or symbols in it!");
		}
		else
		{
			//check the starting character to see if it is a vowel
			
			switch(startingChar){
			case'a':case'e':case'i':case'o':case'u':
				//the first letter is vowel append the word way 
				//to the end of the word.
				String pigLatin1 = lCase + ending1;
				System.out.println(userInput +" is translated to: "+ pigLatin1);
				break;
			
			default:
				//it's a constant find first vowel in the word
				int p1 = 0;
				p1 = firstVowel(lCase, p1);
				//save letters to move
				String move = lCase.substring(0, p1);
				//reset lCase to letter from the vowel to the end of the word
				lCase = lCase.substring(p1);
				//now concatenate to make the translated string
				String pigLatin2 = lCase+move+ending2;
				System.out.println(userInput +" is translated to: "+ pigLatin2);
				break;
			}
		}
		
		
	
	  
	}

	/**
	 * @param lCase
	 * @param p1
	 * @return
	 */
	private static int firstVowel(String lCase, int p1) {
		for (int i = 0; i<lCase.length()-1;i++){
		   char c = lCase.charAt(i);
		   System.out.print("i is: "+ i+"  what is c: ");
		   System.out.println(c);
		   if(c =='a'||c =='e'|| c =='i'||c =='o'||c =='u'||
			   c =='A'||c =='E'|| c =='I'||c =='O'||c =='U') {
		        p1= lCase.indexOf(c);//write position of vowel
		        System.out.println("it is:"+p1);
		        break;
		   }
		   	 
		}
		return p1;
	}

	

}
