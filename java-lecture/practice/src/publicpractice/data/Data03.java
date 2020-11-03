package publicpractice.data;

public class Data03 {

	public static void main(String[] args) {
		float c=410.3F;
		System.out.println("work?" + c);
		
		int finger = 10;
		System.out.printf("finger = [%5d] %n", finger);
		System.out.printf("finger = [%-5d] %n", finger);
		System.out.printf("finger = [%05d] %n", finger);
		
		int octNum = 010;
		int hexNum = 0x10;
		int binNum = 0b10;
		
		System.out.println(octNum);
		System.out.println(hexNum);
		System.out.println(binNum);
	
	}
}
