package PublicPractice.firstProject;

import java.util.Scanner;

public class Ex2_02 {
	
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�>> ");
		score = Integer.parseInt(scan.nextLine());
		
		if(score <= 100 && score >= 90) {
			grade = 'A';
		} else if(score < 90 && score >= 80) {
			grade = 'B';
		} else if(score < 80 && score >= 70) {
			grade = 'C';
		} else if(score < 70 && score >= 60) {
			grade = 'D';
		} else if (score > 100 || score < 0) {
			System.out.println("0���� 100���� ������ �Է��ϼ���!");
		} else {
			grade = 'F';
		}
		
		String result = (score <= 100 && score > 0)? "�Է��Ͻ� ���� %d���� %c�����Դϴ� \n" : "";
		
//		System.out.printf("�Է��Ͻ� ���� %d���� %c�����Դϴ� \n", score, grade);
		System.out.printf(result, score, grade);
	}
}
