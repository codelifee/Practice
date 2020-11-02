package Array;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		int menu=0;
		int num=0;
		
		Scanner scan = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.println("1 - pasta");
			System.out.println("2 - pizza");
			System.out.println("3 - rice");
			System.out.println("Chooes the menu (1~3) : ");
			System.out.println("type '0' to exit");
			
			menu=Integer.parseInt(scan.nextLine());
			
			if(menu == 0) {
				System.out.println("You will exit the program");
				break outer;
			} else if(!(1 <= menu && menu <= 3)) {
				System.out.println("Please type the number between 1~3");
				continue;
			}
			
			for(;;) {
				System.out.print("the price of menu.(exit the calculation:0, exit the program:99) :");
				num=Integer.parseInt(scan.nextLine());
				
				if(num == 0) {
					break;	
				} 
				
				if(num == 99) {
					break outer;
				}
				
				switch(menu) {
				case 1: System.out.println("the pasta is " + num); break;
				case 2: System.out.println("the pizza is " + num); break;
				case 3: System.out.println("the rice is " + num); break;
				}
			}
		}
	}
}
