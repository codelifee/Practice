package publicpractice.oop;

class Animal {
	private String name;
	private int age;
	
	Animal() {
		this.name = "codelifee";
		this.age = 1;
	}
	
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void Print() {
		System.out.println(name + " is " + age + " years old");
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		Animal ani = new Animal("monkey", 3);
		ani.Print();
	}
}
