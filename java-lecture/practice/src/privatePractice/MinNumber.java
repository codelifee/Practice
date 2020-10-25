package privatePractice;

public class MinNumber {
	private int number;
	
	MinNumber(int number) {
		this.number = number;
	}
	
	public MinNumber add(int toAdd) {
		number += toAdd;
		return this;
	}
	
	public void print() {
		System.out.println(number);
	}
}
