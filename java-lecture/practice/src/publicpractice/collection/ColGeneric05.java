package publicpractice.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ColGeneric05 {

	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push("1-java");
		myStack.push("2-oracle");
		myStack.push("3-jsp");
		
		while(!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
		System.out.println("=======>");
	}
}
