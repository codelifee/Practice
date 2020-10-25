package privatePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapToList {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();		
		List<Object> maps = new ArrayList<Object>();
		
		
		for(int i=0; i < 2; i++) {
			System.out.println("id: ");
			String id = scan.nextLine();
			System.out.println("password: ");
			String password = scan.nextLine();
			
			map.put("id", id);
			map.put("password", password);
			
			maps.add(map);
			
		}
		
		System.out.println(maps);
		scan.close();
	}
}
