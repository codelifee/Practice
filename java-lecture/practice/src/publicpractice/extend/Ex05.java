package publicpractice.extend;

class A2 {
	A2() {
		super();
	}
	
	public String toString() {
		return "4";
	}
}

class B2 {
	B2() {
		super();
	}
	
	@Override
	public String toString() {
		return super.toString() + "3";
	}
	
}

class Ex05 {
	public static void main(String[] args) {
		B2 b = new B2();
		
		System.out.println(b.toString());
		
		System.out.println(new B2());
		System.out.println(new B2().toString());
	}
}