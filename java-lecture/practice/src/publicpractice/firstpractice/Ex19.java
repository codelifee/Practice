package publicpractice.firstpractice;

public class Ex19 {
	public static void main(String[] args) {
		int a = 10;
		int b = 4;

		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		System.out.printf("%d && %d = %d\n", a, b, a & b);
		
		byte c=10, d=30;
		int re= c*d;
		System.out.println("re = "+ re);
		//c*d의 출력값이 byte타입의 범위를 넘어가기 때문에 전혀 다른 값이 나오게 됨
		// 연산시 jvm은 본래 다른 primitive타입들을 int로 바꾸어주기 때문에 
		// 변수 re의 타입만 int를 담을 수 있는 타입으로 정의해주면 된다.
	}
}
