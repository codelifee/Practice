package privatepractice.projects;

import java.util.Scanner;

public class Account {
	String customerId;
	String customerName;
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
	
	public String checkAccount(SignUp account) {
		
		if(account.equals(account.getId()) && account.equals(account.getName())) {
			return "true";
		} else {
			return "false";
		}
		
	}
	
	public void showMenu() {
		String action ="";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please type your id : ");
		String id = scan.nextLine();
		this.customerId = id;
		
		System.out.println("please type your name : ");
		String name = scan.nextLine();
		this.customerName = name;

		System.out.println("Hello " + name + "!");
		System.out.println("1. Check Balance");
		System.out.println("2. deposit");
		System.out.println("3. withdraw");
		System.out.println("4. getPreviousTransaction");
		System.out.println("5. exit");
		
		whole:
		while(true) {
			
			System.out.println("Please type your id : ");
			SignUp account = class.getClass();
			
			if(this.checkAccount(_id, _name))
			

			System.out.print("Please select the menu : ");


			int input = Integer.parseInt(scan.nextLine());
			
			switch(input) {
			

			case 1:
				System.out.println("Your current balance is " + this.balance);
				break;
		
			case 2: 
				System.out.println("how much money do you want to deposit? : ");
				int deposit = Integer.parseInt(scan.nextLine());
				this.deposit(deposit);
				action = "deposited";
				
				break;
			case 3:
				System.out.println("how much money do you want to withdraw? : ");
				int withdraw = Integer.parseInt(scan.nextLine());
				this.withdraw(withdraw);
				action = "withdrawn";
				
				break;
			case 4:
				int previous = this.getPreviousTransaction();

				System.out.println(action + " : " + previous);
				break;
			case 5:
				
				break whole;
			}
		}
		
		
		scan.close();
	}
}
