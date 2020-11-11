package privatepractice;

public class gugudan {
	public static void multiplication() {
		
		for(int i=2; i<=9; i++) {
			System.out.print(i + "´Ü \t");
		}
		
		System.out.println();
		
		for (int i=2; i<=9; i++) {

			for(int j=2; j<=9; j++) {
				System.out.print(j + "x" + i +"=" + i*j + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		multiplication();
	}
}
