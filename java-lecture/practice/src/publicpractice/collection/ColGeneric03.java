package publicpractice.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class ColGeneric03 {

	public static void main(String[] args) {
		Vector vec = new Vector(4,3);
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		
		for(int i=1; i<=5; i++) {
			list1.add(i);
		}
		
		list2.add("ddd");
		list2.add("dasd");
		
		vec.add(list1);
		
		vec.add(list2);
		
		
		System.out.println(vec);
	}
}
