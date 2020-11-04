package publicpractice.method;

class MyData07 {
	int year=2019;
	int month=10;
	int day=3;
}

class ChageClass {
	public void change(MyData07 t) {
		t.year = 2020;
		t.month = 12;
		t.day = 5;
	}
}

public class Ex12 {

	public static void main(String[] args) {
		MyData07 a = new MyData07();
		MyData07 b = new MyData07();
		
		System.out.println(a);
		System.out.println(b);
		
		a=b;
		
		System.out.println(a);
		System.out.println(b);

		
//		System.out.println(d);
//		ChageClass change = new ChageClass();
//		System.out.println(change);
//		change.change(d);
//		System.out.println(d);		
	}

}
