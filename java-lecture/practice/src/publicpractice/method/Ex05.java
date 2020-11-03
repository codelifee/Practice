package publicpractice.method;

import java.util.ArrayList;
import java.util.List;

class Animal {
	String name;
	int age;
	
	
	public static List<Integer> multiply(int num) {
		List<Integer> gudan = new ArrayList<>();
		
		for(int i=1; i<=9; i++) {
			gudan.add(num*i);
		}
	
		return gudan;
	}
}

public class Ex05 {
	
	public static void main(String[] args) {
		Animal a = new Animal();
	
		System.out.println(a.multiply(9));	
	}
}
