package publicpractice.loop;

public class Ex13 {
	
	public static void main(String[] args) {
				
		double[] data = {9.5, 7.0, 13.6, 7.5, 10.0};
		double max = 0.0;
		for(int i=1;i<data.length;i++) {
			if(data[i]>max) {
				max=data[i];
			}
		}
		System.out.println("this is the maximum value of this array : " + max);
		
		for(int i=0; i<=10; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
