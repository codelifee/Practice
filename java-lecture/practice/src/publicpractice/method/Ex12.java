package publicpractice.method;

class Data10 {
	int x;
}

public class Ex12 {
	
	static void change(int x) {
		x=1000;
		System.out.println("change(): x = " + x);
	}

	public static void main(String[] args) {
		Data10 d = new Data10();
		d.x = 10;
		System.out.println(d.x);
		
		change(d.x);
		
		System.out.println(d.x);
	}

}
