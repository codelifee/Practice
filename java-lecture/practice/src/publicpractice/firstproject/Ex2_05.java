package publicpractice.firstproject;

import java.util.Scanner;

public class Ex2_05 {
	public static void main(String[] args) throws Exception {
		
		int input = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please type in the month you are in ");
		System.out.println("here : ");
		input = Integer.parseInt(scan.nextLine());
		
		if(input <=12 && input > 0) {
			String season = "";

			switch(input) {
			case 12: case 1: case 2:
				season = "겨울";
				break;
	
			case 3: case 4: case 5:
				season = "봄";
				break;
				
			case 6: case 7: case 8:
				season = "여름";
				break;
			
			case 9: case 10: case 11:
				season = "가을";
				break;
			}
			
			System.out.printf("the season is %s", season);
			
		} else {
			scan.close();				
			throw new Exception("please type in the number between 1~10");
		}
		scan.close();				
}
}
