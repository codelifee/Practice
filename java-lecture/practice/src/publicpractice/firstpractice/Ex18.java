package publicpractice.firstpractice;

import java.math.BigInteger;

public class Ex18 {
	public static void main(String[] args) {
		//1
		BigInteger a= new BigInteger("1000000");
		BigInteger b= new BigInteger("2000000");
		
		BigInteger c = a.multiply(b);
		System.out.println(c);
		
		//2
		long d=1000000, e=2000000;
		long f=d*e;
		System.out.println(f);
		
		//3
		int g=1000000, h=2000000;
		long k= (long)(g*h); //°á°ú°©ÀÌ int·Î ´ã°Ü¼­ ³ª¿È
		System.out.println(k);
	}
}
