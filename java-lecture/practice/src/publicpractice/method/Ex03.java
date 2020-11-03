package publicpractice.method;

public class Ex03 {

	static void sum(int[] arr) {
		int sum=0;
		for(int k:arr) {
			sum+=k;
		}
		System.out.println("the cumulative sum = " + sum);
	}
	
	static int getSum(int[] arr) {
		int total=0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
	
	public static void main(String[] args) {
		int[] score = {100,90,100};
		sum(score);
		
		int sum = getSum(score);
		System.out.println(sum);
	}
}
