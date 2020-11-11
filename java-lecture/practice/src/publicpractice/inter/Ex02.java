package publicpractice.inter;


interface IHello{
	void sayHello(String name);
}

class Hello implements IHello{

	@Override
	public void sayHello(String name) {
		System.out.println("Hello");
	}
	
}

public class Ex02{

	public static void main(String[] args) {
		IHello hi;
		
		hi=new Hello();
		
		hi.sayHello("ss");
		
		Hello h = (Hello)hi;
			
		
	}
}
