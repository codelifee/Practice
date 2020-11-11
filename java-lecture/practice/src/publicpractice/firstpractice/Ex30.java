package publicpractice.firstpractice;

import java.util.Scanner;

public class Ex30 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		
		System.out.println("Type a number: ");
		int count = Integer.parseInt(scan.nextLine());
		
		System.out.println("Type a character that you want to type");
		String cha = scan.nextLine();
		
		for (i=0; i<count; i++) {
			System.out.println(cha);
		}
		
		scan.close();
		
	}
}

