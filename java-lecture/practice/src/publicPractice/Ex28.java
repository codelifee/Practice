package publicPractice;

import java.util.Scanner;

public class Ex28 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a identification number: ");
		String jumin = scan.nextLine();
		int year = jumin.charAt(7);
		char gender = jumin.charAt(7);
		

		switch(gender) {
			case '1': 
				System.out.println("You ara a male who's born before 2000s"); break;
			case '3':
				System.out.println("You ara a male who's born after 2000s"); break;
			case '2': 
				System.out.println("You are a female who's born before 2000s"); break;
			case '4':
				System.out.println("You are a female who's born after 2000s"); break;
 		}
		
		
		
		scan.close();
	}
}

