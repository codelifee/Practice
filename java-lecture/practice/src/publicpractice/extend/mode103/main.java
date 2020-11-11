package publicpractice.extend.mode103;

import publicpractice.extend.mode101.Animal;
import publicpractice.extend.mode102.Cat;
import publicpractice.extend.mode102.Dog;

public class main {

	public main() {
		Animal[] animal = new Animal[2];
		
		animal[0] = new Dog();
		animal[1] = new Cat();
		
		for(Animal ani : animal) {
			ani.walk();
		}
		
	}
}
