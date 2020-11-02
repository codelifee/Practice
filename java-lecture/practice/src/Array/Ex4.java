package Array;

public class Ex4 {

	public static void main(String[] args) {
		int[] value = new int[3];
		value[0] = 10;
		value[1] = 20;
		value[2] = 30;
		
		System.out.printf("value the size of the array = %d%n", value.length);
		for(int i=0; i<value.length; i++) {
			System.out.printf("value[%d]=%d%n", i,value[i]);
		}
		
	}
}
