package publicpractice.method;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	static void name_func(String name) {
		System.out.println(name);
	}
	
	static void guDan(int num) {
		System.out.println("9 multiplication table");
		for(int i=1;i<=9;i++) {
			System.out.println(num + " x " + i + "=" + num*i);
		}
	}
	
	public static void main(String[] args) {
		name_func("sumin");
		guDan(3);
	}
}
