package publicpractice.extend;

class Animal {
	String kind;
	int leg;
	
	Animal() {
	}
	
	Animal(String kind, int leg) {
		this.kind = kind;
		this.leg = leg;
	}
	
	String getKind() {
		return this.kind;
	}
	
	void walk() {
		System.out.println("walking with " + this.leg + " legs");
	}
}

class Ex04 {
	public static void main(String[] args) {
		Animal dog = new Animal("dog", 4);
		Animal human = new Animal("human", 2);
		
		if(dog.kind == "dog") {
			dog.walk();
		} else {
			human.walk();
		}
	}
}