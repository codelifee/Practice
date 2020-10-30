package data;

public class Data05 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int)(pi*1000) /1000F;
		System.out.println("shortPi = " + shortPi);
		
		double pi2=3.141592;
		int cast = (int)pi2;
		double floor = (double)pi2-cast;
		System.out.println(cast);
		System.out.println(floor);
		
//		double longPi1 = (int)(pi2*1000+0.5);
//		double longPi2 = (int)longPi1 / 1000f;
//		double longPi3 = (double)3142/1000;
//		double longPi4 = (int)(pi2*1000+0.5) / 1000f;
//		System.out.println(longPi1);
//		System.out.println(longPi2);
//		System.out.println(longPi3);
	}
}
