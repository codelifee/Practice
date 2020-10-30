package data;

import java.util.Scanner;

public class Data10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type : ");
		String input = scan.nextLine();
		char ch=input.charAt(0);
		
		
		if(ch >= '0' && ch <= '9') {
			System.out.println("it's a number " + ch);
		} 
		
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("it's a character " + ch);
		}
		
		scan.close();
	}
}
