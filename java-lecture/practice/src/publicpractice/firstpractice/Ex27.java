package publicpractice.firstpractice;

import java.util.Scanner;

public class Ex27 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0;
		char grade = ' ';
		char opt = '0'; //specify the range of grade A0, B0, C0, D0
		
		System.out.println("Type a number bewteen 0 ~ 100 >> ");
		String input = scan.nextLine();
		score = Integer.parseInt(input);
		
		if(0 <= score && score <= 100) {
			

			if(score >= 90) {
				grade = 'A';
			} else if (score >= 80) {
				grade = 'B';
			} else if (score >= 70) {
				grade = 'C';
			} else {
				grade = 'F';
			}
			
			char check = input.charAt(1);
			
			
			if (grade != 'F') {
				if(check >= '8' || score == 100) {
					opt = '+';
				} else if ('0' <= check && check < '4') {
					opt = '-';
				} 
			} else {
				opt = ' ';
			}
			
			System.out.println("The grade is = " + grade + opt);
			
		} else {
			System.out.println("The number between 0 ~ 100 only allowed here");
		}
		
		
		scan.close();
	}
}
