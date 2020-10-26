package privatePractice;

import java.util.Scanner;

public class MapToList {	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Mapping[] maps = new Mapping[7];
				
		for(int i=0; i < 2; i++) {
			
			System.out.println("id: ");
			String id = scan.nextLine();
			System.out.println("password: ");
			String password = scan.nextLine();
			
			maps[i] = new Mapping();
			maps[i].setId(id);
			maps[i].setPassword(password);						
		}
		
		for(int i=0; i<2; i++) {
			System.out.println("id is " + maps[i].getId() + " password is " + maps[i].getPassword());
		}
		
		scan.close();
	}
}
