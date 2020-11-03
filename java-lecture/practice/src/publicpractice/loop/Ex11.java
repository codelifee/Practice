package publicpractice.loop;

public class Ex11 {
	
	public static void main(String[] args) {
				
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=i;j++) {
				if(j > 1) {
					System.out.printf("%5c", ' ');
				} 
			}
			System.out.printf("[%d, %d]", i, i);
			System.out.println();
		}
	
	}
}
