package publicPractice;

import java.util.Scanner;

public class Ex33 {
	
	public static void main(String[] args) {
		int num;
		int sum=0;
		boolean flag = true;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("type the numbers that you want to calcilate the total sum of (type 0 to exit)");
		
		while(flag) {
			System.out.print("here: ");
			num = Integer.parseInt(scan.nextLine());
			
			if(num != 0) {
				sum = sum + num;
			} else {
				flag = false;
			}
		}
		System.out.println("sum is " + sum);
		
	}
}

