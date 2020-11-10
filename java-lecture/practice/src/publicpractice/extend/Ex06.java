package publicpractice.extend;

class A3 {
	A3() {
		super();
	}
	
	public String toString() {
		return "4";
	}
}

class B3 extends A3{
	B3() {
		super();
	}
	
	@Override
	public String toString() {
		return super.toString() + "3";
	}
}

public class Ex06 {
	public static void main(String[] args) {
		B3 b = new B3();
			
		System.out.println(new B3());
		System.out.println(new B3().toString());
	}
}
