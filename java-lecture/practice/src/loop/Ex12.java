package loop;

public class Ex12 {
	
	public static void main(String[] args) {
				
		int[] score = new int[5];
		
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
		int[] score2 = {100,95,90};
		int total=0;
		double ave;
		
		for(int i=0; i<score2.length; i++) {
			total += score2[i];
		}
		
		ave = total/score2.length;
		
		System.out.println("total = "+total);
		System.out.println("average = "+ave);
		
	}
}
