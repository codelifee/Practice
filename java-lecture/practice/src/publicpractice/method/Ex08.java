package publicpractice.method;

import java.util.HashMap;
import java.util.Map;

class Product {
	private String name;
	private int price;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
}

public class Ex08 {

	public static void main(String[] args) {
		Map<String, Integer> bending = new HashMap<>();
		Product product = new Product();
		
		product.setName("cola");
		product.setPrice(1000);
		
		bending.put(product.getName(), product.getPrice());
		
		
		product.setName("chicken");
		product.setPrice(8000);
		
		bending.put(product.getName(), product.getPrice());
		
		System.out.println("The menus in the bending machine are : \n" + bending);
	}

}
