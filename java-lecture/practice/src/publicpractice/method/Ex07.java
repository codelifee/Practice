package publicpractice.method;

class Thing01 {
	private int x;
	
	public void setter(int x) {
		this.x = x;
	}
	
	public int getter() {
		return this.x;
	}
}

public class Ex07 {

	public static void main(String[] args) {
		Thing01 thing = new Thing01();
		
		thing.setter(3);
		int x = thing.getter();
		
		System.out.println(x);
		
	}

}
