package publicpractice.array;

import java.util.Arrays;

public class Ex08 {

	public static void main(String[] args) {
//		int sum=0;
//		double average=0.0;
//		
//		int[] score= {100, 88, 100, 100, 9};
//		
//		for(int i=0; i<score.length; i++) {
//			sum+=score[i];
//		}
//		average=sum/(double)score.length;
//		
//		System.out.println("the total sum is = " + sum);
//		System.out.println("the average is = " + average);
	
		int[] numScore= {79,88,91,33,100,55,95};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<numScore.length; i++) {
					
			if(numScore[i] > max) {
				max = numScore[i];
			} else if(numScore[i] < min) {
				min = numScore[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
