package practice;

import java.util.Scanner;

public class Ex2_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(i=0, i<3, i++) {
			System.out.println("type integer: ");
			int a = Integer.parseInt(scan.nextLine());
			if(a > 0) {
				System.out.println(a+" is positive number");
			} else if(a < 0) {
				System.out.println(a+" is negative number");
			} else {
				System.out.println("it is 0.");
			}
		}
	}
}
