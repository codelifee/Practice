package publicpractice.loop;

public class Ex06 {

	public static void main(String[] args) {
		int i=0;

		
		int count=0;
		int sum=0;
		
		for(i=22; i<76; i++) {
			if(i % 2 == 0) {
				sum += i;
				count += 1;
			}
		}
		
		System.out.println("The total number of odd numbers : " + count);
		System.out.println("The total sum of odd numbers : " + sum);
	}
}
