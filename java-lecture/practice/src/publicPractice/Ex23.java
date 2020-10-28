package publicPractice;

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
    		  int firstInt = Integer.parseInt(String.valueOf(firstCh));
			  int secondInt = Integer.parseInt(String.valueOf(secondCh));
    		  
    		  if((firstInt >= 1 && firstInt <= 9) && (secondInt >= 1 && secondInt <=9)) {
    			  
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
