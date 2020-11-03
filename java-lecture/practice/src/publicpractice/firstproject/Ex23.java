package publicpractice.firstproject;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println("Please repectively type in \"one\" number twice");
	      
	      System.out.println("First number :");
	      String firstNum = scan.nextLine();
	      System.out.println("Second number :");
	      String secondNum = scan.nextLine();
	      
	      if(firstNum.length() == 1 && secondNum.length() == 1) {
	    
    		  char firstCh =  firstNum.charAt(0);
    		  char secondCh = secondNum.charAt(0);
    		 
    		  
    		  if((firstCh >= '1' && firstCh <= '9') && (secondCh >= '1' && secondCh <= '9')) {
    			  
    			  int firstInt = Integer.parseInt(firstCh+"");
    			  int secondInt = Integer.parseInt(secondCh+"");
    			  
    			  int max = 0;
    			  int min = 0;
    			  
    			  max = (firstInt > secondInt) ? firstInt : secondInt;
    			  min = (firstInt > secondInt) ? secondInt : firstInt;
    			  
    			  System.out.println("Max is = " + max);
    			  System.out.println("Min is = " + min);

    			  
    		  } else {
    			  System.out.println("This is not a number");
    		  }
	    	  
	      } else {
	    	  System.out.println("please type in one number");
	      }
	      
	      scan.close();
	}
}
