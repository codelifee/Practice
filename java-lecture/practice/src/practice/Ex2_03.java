package practice;

import java.util.Scanner;

public class Ex2_03 {

	public static void main(String[] args) throws Exception {
		int input = 0;
		
		Scanner scan = new Scanner(System.in);

		
		boolean exit = false;
		while(!exit) {
			System.out.println("please type in the month you are in ");
			System.out.println("here : ");
			input = Integer.parseInt(scan.nextLine());
		
			if(input <=12 && input > 0) {
				
				if((input >= 3) && (input <= 5)) {
					System.out.println("��");
				} else if (input >= 9 && input <= 11) {
					System.out.println("����");
				} else if (input >= 6 && input <= 8) {
					System.out.println("����");
				} else {
					System.out.println("�ܿ�");
				}
				exit=true;
			} else {
//				System.out.println("You should type in the number between 0~12");
				throw new Exception("You should type in the number between 0~12");
			}
			
//			switch(input) {
//				
//				case 12:
//				case 1:
//				case 2:
//					System.out.println("�ܿ�");
//					break;
//
//				case 3:
//				case 4:
//				case 5:
//					System.out.println("");
//					break;
//					
//				case 6:
//				case 7:
//				case 8:
//					System.out.println("����");
//					break;
//				
//				case 9:
//				case 10:
//				case 11:
//					System.out.println("����");
//					break;
//			}
		}
		
		scan.close();
	}

}
