package Data;

public class Data07 {

	public static void main(String[] args) {
		
		int a=5, b=10;
		int max=0;
		max = (a>b)?a:b;
		System.out.println("max = " + max);
		System.out.println("=============>");
		
		int age=28;
		String result="";
		result = (age >= 20 && age <= 29) ? "20��":"20�� �ƴ�";
		System.out.println(age + "�� " + result);
		
	}
}
