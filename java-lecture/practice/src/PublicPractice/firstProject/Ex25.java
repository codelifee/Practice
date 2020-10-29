package PublicPractice.firstProject;

import java.util.Scanner;

public class Ex25 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in one of countries >> ");
		
		String input = scan.nextLine();
		char letter = input.charAt(0);
		
		switch(letter) {
		case 'a': case 'A': System.out.println("America"); break;
		case 'c': case 'C': System.out.println("Canada"); break;
		default: System.out.println("I donno what you are talking about haha");
		}
;		
	}
}
