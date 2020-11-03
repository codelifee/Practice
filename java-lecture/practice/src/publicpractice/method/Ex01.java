package publicpractice.method;

public class Ex01 {

	static void sum(int size) {
		int i;
		int total;
		
		for(i=1; i<=size; i++) {
			total=0;
			total += i;
		}
		
		System.out.println("the cumulative sum is : " + total);
	}
	
	static int abs(int data) {
		if(data<0) {
			data = -data;
		}
		return data;
	}
	
	public static void main(String[] args) {
		sum(2);
		
		System.out.println(abs(-5));
	}
}
