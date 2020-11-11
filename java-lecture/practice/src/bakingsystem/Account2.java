package bakingsystem;

import java.util.Scanner;

public class Account2 {
	String customerId;
	String customerPassword;
	int balance;
	int previousTransaction;
//	String action;
	
	public int deposit(int input) {
		this.previousTransaction = input;
		
		this.balance += input;
		return this.balance;
	}
	
	public int withdraw(int input) {
		this.previousTransaction = input;
		
		this.balance -= input;
		return this.balance;
	}
	
	public int getPreviousTransaction() {
		return this.previousTransaction; 
	}
		
	
	public void showMenu() {
		Scanner scan = new Scanner(System.in);
		String action ="No previous transaction";
		int result=0;
		userResgisterAction resgister = new userResgisterAction();
		
		System.out.println("Do you already have account?");
		System.out.println("1. Your account exists");
		System.out.println("2. I want to register");
		int answer = Integer.parseInt(scan.nextLine());
		
		
		if(answer == 1) {
			System.out.println("Great!");
			result = resgister.login();

		} else if (answer == 2) {
			int resgisterResult = resgister.register();
			
			if(resgisterResult == -1) {
				
			} else {
				result = resgister.login();

			}
			
		} else {
			System.out.println("You should type the right number");
		}
		
		
		
		
		
		if(result == 1) {
			
			System.out.println("=============================================");
			System.out.println("Hello !");
			System.out.println("1. Check Balance");
			System.out.println("2. deposit");
			System.out.println("3. withdraw");
			System.out.println("4. getPreviousTransaction");
			System.out.println("5. exit");
			
			whole:
			while(true) {
				System.out.println("=============================================");
				System.out.println("Please select the menu : ");
				System.out.println("=============================================");


				int input = Integer.parseInt(scan.nextLine());
				
				switch(input) {
				

				case 1:
					System.out.println("Your current balance is " + this.balance);
					System.out.println("\n\n");

					break;
			
				case 2:
					
					System.out.println("how much money do you want to deposit? : ");
					
					int deposit = Integer.parseInt(scan.nextLine());
					this.deposit(deposit);
					action = "deposited";
					System.out.println("\n\n");
					
					break;
					
				case 3:
					System.out.println("how much money do you want to withdraw? : ");
					
					int withdraw = Integer.parseInt(scan.nextLine());
					
					if(balance >= withdraw) {
						this.withdraw(withdraw);
						action = "withdrawn";

						System.out.println("\n\n");
						break;
					} else {
						System.out.println("You only have " + balance);
						break;
					}
						
					
				case 4:
					int previous = this.getPreviousTransaction();

					System.out.println(action + " : " + previous +"\n\n");
					break;
				case 5:
					
					break whole;
					
				default : 
					System.out.println("Invaild option submitted");
					break;
				}
			}
			} else {
				System.out.println("Please check your account");
			}
			
			System.out.println("thank you for using our services");
		
		
		scan.close();
	}
}
