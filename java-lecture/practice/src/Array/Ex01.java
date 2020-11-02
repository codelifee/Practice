package Array;

public class Ex01 {

	public static void main(String[] args) {
		
		int sum = 0;
	
		for(int i=1; i<=10; i++) {
			if(i % 4 == 0) {
				continue;
			} else {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
