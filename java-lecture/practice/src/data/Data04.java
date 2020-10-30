package data;

public class Data04 {

	public static void main(String[] args) {
		char a1 = 'a';
		int lowerA = a1;
		char a2 = 'A';
		int upperA = a2;
		System.out.println("lowerA : " + lowerA);
		System.out.println("upperA : " + upperA);
		
		char calA = (char)(a1 - 32);
		
		System.out.println("calculated A is " + calA);
	}
}
