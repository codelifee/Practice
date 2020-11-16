package publicpractice.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class ColGeneric04 {

	public static void main(String[] args) {
		Vector vec = new Vector(4,3);
		double[] arr = new double[] {1.1,2.2,3.3};
		vec.add(arr);

		
		for(int i=0; i<arr.length; i++) {
			double[] result = (double[])vec.get(0);
			System.out.println(result[i]);
		}
		
		double findData = 6.1;
		int index=vec.indexOf(findData);
		
		if(index != -1) {
			System.out.println("success :" + index);
		} else {
			System.out.println("fail :" + index);
		}
	}
}
