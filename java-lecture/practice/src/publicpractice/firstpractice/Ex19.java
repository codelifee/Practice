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
		//c*d�� ��°��� byteŸ���� ������ �Ѿ�� ������ ���� �ٸ� ���� ������ ��
		// ����� jvm�� ���� �ٸ� primitiveŸ�Ե��� int�� �ٲپ��ֱ� ������ 
		// ���� re�� Ÿ�Ը� int�� ���� �� �ִ� Ÿ������ �������ָ� �ȴ�.
	}
}
