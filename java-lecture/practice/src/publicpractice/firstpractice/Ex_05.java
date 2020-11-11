package publicpractice.firstpractice;

import java.util.Scanner;

public class Ex_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수강과목 => ");
		String subject = scan.nextLine();
		
		System.out.println("학생명: ");
		String student = scan.nextLine();
		
		System.out.println("age: ");
		int age01 = scan.nextInt();
		//int age02 = Integer.parseInt(age01); //it converts String into Int
		
		System.out.println("수강과목: "+subject);
		System.out.println("학생이름: "+student);
		System.out.println("나이: "+age01);
		scan.close();
		
	}
}
