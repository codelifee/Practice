package publicpractice.firstproject;

import java.util.Scanner;

public class Ex35 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		
		System.out.print("Type the number that you want to print odd numbers out of : ");
		int input = Integer.parseInt(scan.nextLine());
				
		//print even numbers
		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("");
		
		//print odd numbers
		for (int i=1; i <= input; i+=2) {
			System.out.print(i + " ");
		}
		
		scan.close();
	}
}

