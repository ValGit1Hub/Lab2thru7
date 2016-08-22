package LabWork;
	import java.util.Scanner;
	
	public class LabNum4 {
		public static void main(String[] args) {
	
        int input = 0;
        String choice =  "yes";
        
        Scanner scan1 = new Scanner(System.in);
        
        // Ask user for input
        System.out.println("Wecome to the Factorial game!");
        
        while(choice.equalsIgnoreCase("yes")) {
        	long intFactorial = 1;
            System.out.println("Please enter an integer that is between 0 and 10: ");
            input = scan1.nextInt();
            scan1.nextLine();
            if (input >=10 || input <1){
            	System.out.println("Wrong! Enter a number between 1 and 10");
            }
            else
            {
            	
            	intFactorial = getFactorial(input,intFactorial);
                System.out.println("The Factorial of: " + input + " is "+ intFactorial);
            }
            
            System.out.println("Continue? Yes or No?");
            choice = scan1.nextLine();
          
        }
        System.out.println("Thank you for playing :^)");
        scan1.close();
	}
     public static long getFactorial(int input,long intFactorial) {
    	 
        for (int i = 1; i <= input; i++) {
        	
        	intFactorial = intFactorial * i;    
          System.out.println(i + " =" + " " + intFactorial );  
        	}
        return intFactorial;
    }

	
}
      


