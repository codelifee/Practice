package publicpractice.method;

import java.util.HashMap;
import java.util.Map;

class Mt03 {
	int abs(int num) {
		if(num < 0) {
			num = - num;
		}
		return num;
	}
	
	double abs(double num) {
		if(num<0) {
			num=-num;
		}
		return num;
	}
	
	void p(int a, int b) {
		System.out.println(a+", "+b);
	}
	
	void p(int a) {
		System.out.println(a);
	}
}

public class Ex09 {

	public static void main(String[] args) {
		Mt03 math = new Mt03();
		
		System.out.println(math.abs(-2.2));
		System.out.println(math.abs(-2));
		
		math.p(1);
		
	}

}
