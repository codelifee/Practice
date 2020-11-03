package publicpractice.loop;

public class Ex02 {

	public static void main(String[] args) {
		int i;
		int total = 0;
		int sum = 0;
		
		for(i=1; i<=10; i++) {
			if(i % 2 == 0) {
				sum=sum+i;
			} else {
				total +=i;
			}
			
		}
		
		System.out.println(sum);
		System.out.println(total);
	}
}
