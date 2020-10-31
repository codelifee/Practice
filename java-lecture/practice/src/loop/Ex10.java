package loop;

public class Ex10 {
	
	public static void main(String[] args) {
		
		exit:
		for(int a=1; a<=9; a++) {
			for(int i=1;i<=9;i++) {
				if(i%3 ==0) {
					break exit;
				}
				System.out.println("i = " + i);
			}
			System.out.println("a = " + a);
		}
	}
}
