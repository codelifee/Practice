package publicpractice.firstpractice;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("Please type in a number here: ");

			try {
				String str = scan.nextLine();
				char ch = str.charAt(0);
				
				if(0 <= ch && 9 <= ch) {
					int _int = Integer.parseInt(String.valueOf(ch));
					String result = (_int%2 == 0) ? "even" : "odd";
					System.out.println("This is " + result + " number");
				} 
				
				exit = true;

			} catch(Exception e) {
				System.out.println("Number is only allowed here");
			}
		}
		
		scan.close();
	}
}
