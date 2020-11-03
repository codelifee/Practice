package publicpractice.array;

import java.util.Arrays;

public class Ex11 {

	public static void main(String[] args) {
		
		int[][] score = new int[3][2];
		int row,col;
		
		score[0][0]=100; score[0][1]=95;
		score[1][0]=90; score[1][1]=85;
		score[2][0]=0; score[2][1]=100;
		
		for(row=0;row<3;row++) {
			for(col=0;col<2;col++) {
				System.out.print(" "+score[row][col]);
			}
			System.out.println();
		}
	}
}
