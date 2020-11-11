package publicpractice.extend;


abstract class Animal01 {
	  abstract void walk();
	}

class Dog01 extends Animal01 {
	void walk() {
		System.out.println("dog");
	}
}

class Cat01 extends Animal01 {
	void walk() {
		System.out.println("cat");
	}
}

class Ex10 {
	void walk(Animal01 ani) {
		ani.walk();
	}
	
	public static void main(String[] args) {
		Animal01 ani [] = new Animal01[2];
		
		ani[0] = new Dog01();
		ani[1] = new Cat01();
		
		for(int i=0; i<ani.length; i++) {
			ani[i].walk();
		}
	}
}