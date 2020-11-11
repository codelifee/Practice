package publicpractice.firstpractice;

import java.util.Scanner;

public class Ex34 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100) + 1;
		
		
		do {
			System.out.print("Guess the number : ");
			input = Integer.parseInt(scan.nextLine());
			if (input > answer) {
				System.out.println("Type smaller number");
			} else if (input < answer) {
				System.out.println("Type bigger number");
			}
		} while(input != answer);
		
		System.out.println("That's correct");
		
	}
}

