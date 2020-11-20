package try_catch;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Try06 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("a");
		list.add("b");
		
		try(PrintWriter output = new PrintWriter("./src/try_catch/result.txt")){
			for(String s:list) {
				output.println(s.toUpperCase());
			}
		}
		
	}
}
