package publicpractice.method;


//class Animal {
//	String name;
//	int age;
//}

class Thing {
	int x = 10;
}

public class Ex04 {
	
	public static void main(String[] args) {
		Animal a; // the address is not yet saved
		a=new Animal(); // 'new' keyword create the address of reference 'a'. this is the instance
		System.out.println(a);

		
		a.age = 0;
		a.name = " ";
		
		Animal b = new Animal();
		
		b.name = "penguins";
		b.age = 26;
		System.out.println(b.name);
		
	}
}
