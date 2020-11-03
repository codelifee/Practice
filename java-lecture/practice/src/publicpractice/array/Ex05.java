package publicpractice.array;

public class Ex05 {

	public static void main(String[] args) {
		int[] values = new int[3];
		
		for(int i=0; i<3; i++) {
			values[i] = (i+1)*10;
		}
		
		for(int value:values) {
			System.out.println(value);
		}
		
	}
}
