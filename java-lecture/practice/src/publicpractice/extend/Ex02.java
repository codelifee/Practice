package publicpractice.extend;

class Parent02 {
	protected int x=10;
	protected int z=30;
}

class Child02 extends Parent02 {
	public void print() {
		super.print();
		System.out.println("I am Child");
	}
}

class Ex02 {
	public static void main(String[] args) {
		Child02 ch = new Child02();
		ch.print();
		
//		Parent02 p = new Parent02();
//		p.print();
		
	}
}