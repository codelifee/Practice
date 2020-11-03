package publicpractice.loop;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		while(true) {
			System.out.println("Type the menu you want : ");
			System.out.println("(type '0' to exit)");
			System.out.println("1-pizza");
			System.out.println("2-pasta");
			System.out.println("3-hamburgur");
			
			menu = Integer.parseInt(scan.nextLine());
			
			if(menu==0) {
				System.out.println("You exited the program");
				break;
			}else if(!(menu>=1 && menu<=3)) {
				System.out.println("Please type the menu between 1~3");
				continue;
			}
			
			System.out.println("Your menu is " + menu);
		}
		
		scan.close();
	}
}
