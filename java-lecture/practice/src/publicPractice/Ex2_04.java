package publicPractice;

public class Ex2_04 {
	
	public static void main(String[] args) {
		String con = "Korea";
		char ch=con.charAt(0);
		
		switch(ch) {
			case 'A': case 'a':
				System.out.println("US");
				break;
			case 'K': case 'k':
				System.out.println("korea");
		}
	}
}
