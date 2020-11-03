package publicpractice.array;

import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i + 1;
		}
		
		
		int[] tmp = new int[arr.length*2];
		
		for(int i=0; i<arr.length; i++) {
			tmp[i] = arr[i];
		}
		arr = tmp;
		
		arr[6] = 2;
		
		for(int ar: arr) {
			System.out.println(ar);
		}
	}
}
