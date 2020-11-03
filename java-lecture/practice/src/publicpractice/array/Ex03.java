package publicpractice.array;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int max = 0;
		
//		for(int i=0; i<100; i++) {
//			if(i % 7 == 0) {
//				max = i;
//			}
//		}
//		System.out.println(max);
		
		for(int i=100; i>1; i--) {
			if(i % 7 == 0) {
				max = i;
				break;
			}
		}
		
		System.out.println(max);
	}
}
