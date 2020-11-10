package publicpractice.extend;

class Father {
	void p() {
		System.out.println("father");
	}
}

class Son extends Father {
	
	void p() {
		System.out.println("overrided method");
	}
	
	void s() {
		System.out.println("son class");
	}
}

class Ex08 {
	
	public static void main(String[] args) {
		Son s = new Son();
		s.p();
		s.s();
		
		Father f = new Father();
		f.p();
		
		Father f2=new Son();
		f2.p();
	}	
}