package publicpractice.loop;

public class Ex03 {

	public static void main(String[] args) {
		int i;
		int j;
		
		int z = 2;
				
		//why '==' is not working?
		while(z < 10) {
			System.out.print(z + "´Ü                        ");
			z++;
		}
		
		System.out.println();
		
		for(i=2; i<10; i++) {	
			for(j=2; j<10; j++) {
				System.out.print(j + " x " + i + "= " +i*j + "\t");
//				System.out.printf("%d x %d = %d \t", j, i, i*j);
			}
			System.out.println();
		}
		
	}
}
