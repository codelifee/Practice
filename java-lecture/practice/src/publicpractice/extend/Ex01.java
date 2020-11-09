package publicpractice.extend;

class Parent01 {
	public void p01() {
		System.out.println("parent01");
	}
}

class Child01 extends Parent01 {
	public void ch01() {
		System.out.println("child01");
	}
}

class Ex01 {
	public static void main(String[] args) {
		Child01 ch = new Child01();
		ch.ch01();
		ch.p01();
		
		Parent01 p = new Parent01();
		p.p01();
	}
}