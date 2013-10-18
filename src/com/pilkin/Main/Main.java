package com.pilkin.Main;

import java.util.Scanner;


public class Main
{
        private static Scanner input;

		public static void main(String []args) throws InterruptedException{
        	
        	Presentation1();
        
        	quiz.main(args);
        	
        	System.out.println("Well, thank you for doing our quiz!");
        	System.out.println("This presentation was created by George Bastow, Dan Lovegrove and Thomas");
	 
        }
        
        public static void Presentation1() throws InterruptedException{
        	
        	input = new Scanner ( System.in ); 
        	
        	String Name;
        	String nameinput;
        	
        	System.out.print("Hello welcome to Happy Numbers! ");
        	System.out.println("So what would your name be?");
        	
            Name = input.nextLine();
            
            System.out.println("Hello Welcome to our happy numbers presentation " + Name);
            Thread.sleep(1000);
            System.out.println("Well What are happy numbers? Well happy numbers are. Press Enter To continue");
            input.nextLine();
            System.out.println("Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1. Press Enter To continue");
            input.nextLine();
            System.out.println("Basicaly, for example if you had the number 19 then you would need to find the square so that would be 1x1 + 9x9 what would be 82. Press Enter To continue");
            input.nextLine();
            Thread.sleep(500);
            System.out.println("82 is 8x8 + 2x2 what would be 68");
            Thread.sleep(500);
            System.out.println("68 is 6x6 + 8x8 what would be 100");
            Thread.sleep(500);
            System.out.println("then 100 would finaly be 1x1 + 0x0 + 0x0 = 1");
            System.out.println("Press Enter To continue");
            
            System.out.println("Well now that you are up to date on what happy numbers want to take the quiz?");
        	
            nameinput = input.nextLine();
            
            if(nameinput.equals("yes")){
      	      
	        	System.out.println("Wow! Love the epicness!");
	        
	        }
	 
	        else{
	        	System.out.println("Ok then, you didn't say yes. But still your doing it! :)");
	        }
            
            System.out.println("To start the quiz press enter");
            input.nextLine();
        }
}