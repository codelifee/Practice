package publicpractice.array;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		String[][] words = {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		
		for(int i=0; i<words.length; i++) {
			for(int j=0; j<words[i].length; j++) {
				System.out.println(words[i][j]);
			}
		}
		
		Scanner scan = new Scanner(System.in);
		
//		for(int i=0; i<words.length;i++) {
//			System.out.printf("what's the meaning of Q%d. %s = ", i+1, words[i][0]);
//		
//		
//		String answer = scan.nextLine();
//		
//		if(answer.equals(words[i][1])) {
//			System.out.printf("This is correct. %n%n");
//		} else {
//			System.out.printf("This is wrong. The answer is %s.%n%n", words[i][1]);
//		}
//		}
//		
//		scan.close();
	}
}
