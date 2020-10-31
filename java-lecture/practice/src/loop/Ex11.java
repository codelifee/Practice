package loop;

import java.util.ArrayList;

public class Ex11 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[2];
		
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=i;j++) {
				if(j > 1) {
					System.out.printf("         ");
				}
			}
			System.out.printf("[%d, %d]", i, i);
			System.out.println();
		}
	}
}
