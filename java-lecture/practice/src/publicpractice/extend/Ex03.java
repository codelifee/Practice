package publicpractice.extend;

class Parent04 {
	protected int a;
	protected int b;
	protected int c;
	protected int d;
}

class Child04 extends Parent04 {
	Child04(int a, int b, int c, int d) {
		super.a = a;
		super.b = b;
		super.c = c;
		super.d = d;
	}
	
	void print() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class Ex03 {
	public static void main(String[] args) {
		Child04 ch = new Child04(1,2,3,4);
		ch.print();
	}
}