package PublicPractice.firstProject;

import java.util.Scanner;

public class Ex26 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in one number >> ");
		
		String input = scan.nextLine();
		
		if (input.length() == 1) {
			
			int intInput = Integer.parseInt(input);
			
//			switch(intInput) {
//			
//			case 0: System.out.println("This is 0"); break;
//			default: System.out.println("This is not a 0"); break;
//			}
			
			String isZero = (intInput == 0) ? "This is a zero" : "this is not a zero";
			
			System.out.println(isZero);
			
//			if(intInput) {
//				System.out.println("This is 0");
//				System.out.println("This is not a 0");
//			}
			
		} else {
			System.out.println("Please type in only one number");
		}
		
		scan.close();
	}
}
