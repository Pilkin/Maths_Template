package com.pilkin.Main;

import java.util.Scanner;

public class quiz {
	
	 public static int score = 0;
	 
	 public static Scanner scan = new Scanner ( System.in ); 
	 
	 public static void main(String []args){
		 
            Question1(scan);
            
	        System.out.println("Next Question");
	        
	        Question2(scan, score);
	        
	        System.out.println("Next Question");
	        
	        Question3(scan, score);
	        
	        System.out.println("Next Question");
	        
	        Question4(scan, score);
	        
	        System.out.println("Thank you for taking our quiz Your final results are ");
	        System.out.print(score + "/4" );
	       
	        
	 
     }
	
	 private static void Question1(Scanner scan){
     	System.out.println("Is 94 a Happy Number");
	        System.out.println("1 : Yes");
	        System.out.println("2 : No");

	 
	        String in;
	        in = scan.nextLine();
	 
	 
	        if(in.equals("yes")){
	      
	        	System.out.println("Correct\n");
	        	score++;
	        	
	        }
	 
	        else{
	        	System.out.println("Wrong\n");
	       
	        }
	
     }

     private static void Question2(Scanner scan, int t){


     	System.out.println("Is 8 a happy number");
	        System.out.println("1 : yes");
	        System.out.println("2 : no\n");
	 
	        String in;
	        in = scan.nextLine();
	 
	 
	        if(in.equals("no")){
	      
	        	System.out.println("Correct\n");
	        	score++;
	        }
	 
	        else{
	        	System.out.println("Wrong\n");
	        }
     	
     }

     private static void Question3(Scanner scan, int t){

     	System.out.println("What do you have to start with to get a happy number");
	        System.out.println(" 1 : A negitive number");
	        System.out.println(" 2 : A number that is divisible by 3");
	        System.out.println(" 3 : A number that is divisible by 5");
	        System.out.println(" 4 : A positive integer\n");
	 
	        String in;
	        in = scan.nextLine();
	 
	 
	        if(in.equals("4")){
	      
	        	System.out.println("Correct\n");
	        	score++;
	        }
	 
	        else{
	        	System.out.println("Wrong\n");
	        }
     	
}

     private static void Question4(Scanner scan, int t){

     	System.out.println("Is 556 a happy number?");
	        System.out.println(" 1 : Yes");
	        System.out.println(" 2 : No");
	 
	        String in;
	        in = scan.nextLine();
	 
	 
	        if(in.equals("yes")){
	      
	        	System.out.println("Correct\n");
	        	score++;
	        }
	 
	        else{
	        	System.out.println("Wrong\n");
	        }
     	
     }

}
