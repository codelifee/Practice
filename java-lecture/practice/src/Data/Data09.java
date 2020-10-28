package Data;

import java.util.Scanner;

public class Data09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type in one character : ");
		
		String string = scan.nextLine();
		boolean isNumeric = true;
						
		
		  try {
//			   Double num = Double.parseDouble(string);
			   int num = Integer.parseInt(string);
			  } catch (NumberFormatException e) {
			   isNumeric = false;
			  }

			  if (isNumeric) {
			   System.out.println(string + " is a number");
			  } else {
			   System.out.println(string + " is not a number");
			  }
		
		
		scan.close();
	}
}
