package practice;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean exit = false;
		while(!exit) {
			try {
				//if I don't use nextInt, how can I catch an error which is not a number?
				System.out.println("I am gonna check your age.");
				System.out.println("Insert your age here :");
				String result = scan.nextLine();
				int newAge = Integer.parseInt(result);
				
				String ageCheck = (newAge >= 20 && newAge <= 29) ? "20´ë" : "20´ë ¾Æ´Ô";
				
				System.out.println(ageCheck);
				exit = true;
			} catch(Exception e) {
				System.out.println("Please insert the number");
			} 
		}
		
		scan.close();				
	}
	
}
