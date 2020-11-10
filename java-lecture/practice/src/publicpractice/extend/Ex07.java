package publicpractice.extend;

class Parent05 {
	String name;
	
	Parent05() {
		System.out.println("I am a parent");
	}
	
	void p01() {
		System.out.println("p01");
	}
}

class Child05 extends Parent05{
	Child05() {
		System.out.println("I am a child");
	}
	void p01() {
		System.out.println("I am child");
	}
}

public class Ex07 {
	public static void main(String[] args) {
		Child05 ch = new Child05();
		
//		System.out.println(ch);
		
		Parent05 p = new Parent05();
		p.name = "pareng";
		
		Child05 ch01 = (Child05)p;
		ch = (Child05)p;
		
//		System.out.println(p);
//		System.out.println();
//		
		p.p01();

		
	}
}
