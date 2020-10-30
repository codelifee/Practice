package loop;

public class Ex10 {
	
	public static void main(String[] args) {
		
		int i;
		for(i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for(i=1; i<=10; i++) {
			System.out.println(i);
			if(i % 3 == 0) {
				break;
			}
		}
	}
}
