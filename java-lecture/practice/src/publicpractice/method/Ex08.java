package publicpractice.method;

import java.util.HashMap;
import java.util.Map;

class Product {
	String name;
	int price;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(String name) {
		return this.name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice(int price) {
		return this.price;
	}
}

public class Ex08 {

	public static void main(String[] args) {
		Map<String, Integer> bending = new HashMap<>();
		Product product = new Product();
		
		product.name = "cola";
		product.price = 1000;
		
		bending.put(product.name, product.price);
		
		product.name = "chicken";
		product.price = 8000;
		
		bending.put(product.name, product.price);
		
		System.out.println("the menu in the bending machine are : \n" + bending);
	}

}
