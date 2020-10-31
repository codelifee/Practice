package privatePractice;

import java.util.HashMap;
import java.util.Map;

public class Tryout {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); 
		
		for(int i=0; i<3; i++) {
			String id = "1";
			String password = "2";
			
			map.put("id", id);
			map.put("password", password);
		}
		
		System.out.println(map);
	}
}
