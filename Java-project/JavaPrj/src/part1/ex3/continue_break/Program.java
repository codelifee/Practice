package part1.ex3.continue_break;

import java.util.Scanner;

public class Program{
		
public static void main(String[] args) {
		int n = 0;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("���� sp�� �����ؼ� 5�� �̻� �Է��ϼ���:");
		
		while(scan.hasNext()) {
			n = scan.nextInt();
			
			if(n < 10) 
				continue;
			
			if(n > 200)
				break; 
			
			System.out.println(n);
		}
	}
}
