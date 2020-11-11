package bakingsystem;

import java.util.Scanner;

public class userResgisterAction {
	String id;
	String password; 
	
	public int register() {
		int result = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please type your id : ");
		id = scan.nextLine();
		System.out.println("Please type your password : ");
		password = scan.nextLine();
		
		
		
		try {
			UserDAO userDAO = new UserDAO();
			result = userDAO.join(new UserDTO(id, password));
			if(result == -1) {
//				System.out.println("Register Failure");
			} else {
				System.out.println("successful");
			}
		} catch(Exception e) {
			System.out.println("database error");
		}
		
		return result;
		
		
	}
	
	public int login() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please type your id : ");
		id = scan.nextLine();
		System.out.println("Please type your password : ");
		password = scan.nextLine();
		
		UserDAO userDAO = new UserDAO();
		int result = userDAO.login(id, password);
		
		return result;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
