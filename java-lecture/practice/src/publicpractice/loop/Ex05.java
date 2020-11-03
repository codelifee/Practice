package publicpractice.loop;

public class Ex05 {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		int k=0;
				
		for(i=1; i<=3; i++) {
			for(j=1; j<=3; j++) {
				for(k=1; k<=3; k++) {
					System.out.println(""+i+j+k);
				}
			}
		}
	}
}
