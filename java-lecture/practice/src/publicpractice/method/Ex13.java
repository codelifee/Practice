package publicpractice.method;

class Data11 {
	int x;
}

public class Ex13 {
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,6,5,4};
		
		printArr(arr);
		
		int result = getSum(arr);
		
		System.out.println(result);
		
		prSum();
		
	}

	static void printArr(int[] x) {
		
		for(int a:x) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	static int getSum(int[] x) {
		
		int sum =0;
		
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		
		return sum;
	}

	static void prSum() {
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
}
