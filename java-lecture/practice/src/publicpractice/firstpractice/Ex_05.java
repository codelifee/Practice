package publicpractice.firstpractice;

import java.util.Scanner;

public class Ex_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�������� => ");
		String subject = scan.nextLine();
		
		System.out.println("�л���: ");
		String student = scan.nextLine();
		
		System.out.println("age: ");
		int age01 = scan.nextInt();
		//int age02 = Integer.parseInt(age01); //it converts String into Int
		
		System.out.println("��������: "+subject);
		System.out.println("�л��̸�: "+student);
		System.out.println("����: "+age01);
		scan.close();
		
	}
}
