package privatepractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ToList {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Mapping> maps = new ArrayList<Mapping>();
		
		for(int i=0; i < 2; i++) {
			
			System.out.println("id: ");
			String id = scan.nextLine();
			System.out.println("password: ");
			String password = scan.nextLine();
			
			maps.add(new Mapping(id, password));			
		}
		
		for(int i=0; i<2; i++) {
			System.out.println(maps.get(i).getId());
			System.out.println(maps.get(i).getPassword());
		}
		
		scan.close();
	}
}
