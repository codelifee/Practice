package publicpractice.collection;

import java.util.Enumeration;
import java.util.Vector;

public class ColGeneric03 {

	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i=0; i<=3; i++) {
			v.add(new Integer(i*10));
		}
		
		System.out.println(v.elements());
		Enumeration enu2 = v.elements();
		
		while(enu2.hasMoreElements()) {
			System.out.println(" " + enu2.nextElement());
		}
		
		System.out.println(v);
	}
}
