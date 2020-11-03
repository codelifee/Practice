package publicpractice.array;

import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10+1);
		}

//		for(int ar: arr) {
//			System.out.println(ar);
//		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[11]);
	}
}
