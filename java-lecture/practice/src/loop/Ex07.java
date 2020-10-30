package loop;

public class Ex07 {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		
		int count=0;
		int sum=0;
		
		for(i=1; i<=100; i++) {
			for(j=0; j<10; j++) {
				sum += i+j;
				}
			count = i;
			i+=9;
			System.out.printf("The total sum of %d ~ %d = %d \n", count, i, sum);
		}
	}
}
