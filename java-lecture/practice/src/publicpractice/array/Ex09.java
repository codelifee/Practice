package publicpractice.array;

import java.util.Arrays;

public class Ex09 {

	public static void main(String[] args) {
		
		
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i]=i;
			System.out.print(numArr[i]);
		}
		
		System.out.println();

		
		for(int i=0; i<50;i++) {
			int n=(int)(Math.random()*10);
			
			int tmp = numArr[n];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for(int num :numArr) {
			System.out.print(num);
		}
	}
}
