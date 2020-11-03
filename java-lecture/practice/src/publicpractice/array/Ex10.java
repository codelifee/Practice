package publicpractice.array;

import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		
		String str="012345";
		String tmp2=str.substring(1,4);
		
		char ch2 = ' ';
		
		for(int i=0; i<str.length(); i++) {
			ch2=str.charAt(i);
		}
		
		System.out.println();
		
		char[] chArr = str.toCharArray();
		for(char ch:chArr) {
			System.out.print(ch);
		}
		
		
	}
}
