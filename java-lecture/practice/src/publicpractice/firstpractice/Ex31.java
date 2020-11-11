package publicpractice.firstpractice;

import java.util.Scanner;

public class Ex31 {
	
	public static void main(String[] args) {
		int sum = 0;
		
		int i=10;
		while(i > 0) {
			
			if(i % 2 == 1) {
				sum += i;
			}
			
			i-- ;
		}
		
		System.out.println("the sum of odd numbers is " + sum);
	}
}

