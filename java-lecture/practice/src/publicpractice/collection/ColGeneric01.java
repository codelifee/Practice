package publicpractice.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColGeneric01 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "good");
		map.put(2, 123);
		map.put(3, 1.5);
		
		System.out.println(map.size());
		System.out.println(map);
	}
}
