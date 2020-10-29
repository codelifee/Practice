package PublicPractice.firstProject;

import java.util.Scanner;

public class Ex2_02 {
	
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		Scanner scan = new Scanner(System.in);
		System.out.print("접수 입력>> ");
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
			System.out.println("0부터 100사이 점수만 입력하세요!");
		} else {
			grade = 'F';
		}
		
		String result = (score <= 100 && score > 0)? "입력하신 점수 %d점은 %c학점입니다 \n" : "";
		
//		System.out.printf("입력하신 점수 %d점은 %c학점입니다 \n", score, grade);
		System.out.printf(result, score, grade);
	}
}
