package publicPractice;

public class Ex10 {
	public static void main(String[] args) {
		byte var1=127;
		short var2=128;
		int var3=128;
		long var4=128L;
		var4 = var1; //byte -> long
		System.out.println(var1+", "+ var2);
		int castVar1 = var3;
		
//		castVar1 = var3;
		//데이터를 잃지 않기위해 이런 방법을 써도 되나요.
		System.out.println(castVar1+", "+var3);
		System.out.println(var1);
		
		float var5=123456.789123f;
		double var6=123456.789123;
		double castVar5 = var5;
		var5=(float)var6;
		System.out.println(var5+", "+var6);
		var6=var5;
		System.out.println(var5+", "+var6);
	}
}
