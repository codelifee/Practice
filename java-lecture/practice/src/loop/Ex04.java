package loop;

public class Ex04 {

	public static void main(String[] args) {
		String str = "#";
		int i=0;
		int j=0;
				
		for(i=1; i<6; i++) {
			for(j=0; j<i; j++) {
				System.out.print(str);
				
			}
			System.out.println();
		}
	}
}
