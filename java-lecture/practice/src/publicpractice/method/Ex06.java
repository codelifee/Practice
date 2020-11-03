package publicpractice.method;

class Tv01 {
	String color;
	boolean power;
	int channel;
	
	void power() {
		power=!power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

public class Ex06 {
	
	public static void main(String[] args) {	
		Tv01 tv1 = new Tv01();
		Tv01 tv2 = new Tv01();
		
		System.out.println(tv1.channel);
		System.out.println(tv2.channel);
		
		tv2.channelUp();
		
		System.out.println(tv1.channel);
		System.out.println(tv2.channel);
		
		
	}
}
