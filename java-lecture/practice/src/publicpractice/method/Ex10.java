package publicpractice.method;

import java.util.HashMap;
import java.util.Map;

class Mt04 {
	void arr(int ... num) {
		for(int i=0; i<num.length;i++) {
			System.out.println(num[i]);
		}
	}
	
}

public class Ex10 {

	public static void main(String[] args) {
		Mt04 math = new Mt04();
		
		math.arr(1,2,3,4,5);
		
	}

}
