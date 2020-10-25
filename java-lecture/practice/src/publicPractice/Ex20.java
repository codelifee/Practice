package publicPractice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean exit = false;
		while(!exit) {
			try {
				System.out.println("please type in the number that you want to assess");
				System.out.println("here : ");

//				int input = scan.nextInt();
//				 why can I not iterate this loop with this statement?
				String input0 = scan.nextLine();
				int input1 = Integer.parseInt(input0);
				
				String result = (input1 % 2 == 0) ? "even" : "odd";
				System.out.println("this number is " + result);
				
				exit=true;
			} catch(Exception e) {
				System.out.println("You should type in number, not a String");
			}
			
		}
		
		scan.close();

	}
}
