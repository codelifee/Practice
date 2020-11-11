package publicpractice.firstpractice;

import java.util.Scanner;

public class Ex24 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in the number between 0~100>> ");
		
		int score = Integer.parseInt(scan.nextLine());
				
		if(0 <= score && score <= 100 ) {
			char grade = ' ';
			score = score / 10;
			switch(score) {
			case 10: case 9: grade='A'; break;
			case 8: case 7: grade = 'B'; break;
			case 6: case 5: grade = 'C'; break;
			case 4: grade = 'D'; break;
			default: grade = 'F'; break;
			
			}
			
			System.out.println(grade);
		} else {
			System.out.println("Please type in numbers between 1~100");
		}
	}
}
