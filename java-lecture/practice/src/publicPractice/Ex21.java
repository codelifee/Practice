package publicPractice;

public class Ex21 {

	public static void main(String[] args) {
		int x=10;
		int y=-5;
		int z=0;
		
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		absX = (x >= 0) ? x:-x;
		absY = (y >= 0) ? y:-y;
		absZ = (z >= 0) ? z:-z;
		
		signX = (x>0)?'+':(x==0?' ':'-');
		signY = (y>0)?'+':(y==0?' ':'-');
		signZ = (z>0)?'+':(z==0?' ':'-');
		
		System.out.println(absX);
		System.out.println(signX);
	}
}
