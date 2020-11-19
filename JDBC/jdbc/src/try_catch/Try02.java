package try_catch;

class Member04 {
	String id="kk";
	String name="sumin";
}

public class Try02 {

	public static void main(String[] args) {
		Member04 m=null;
		
		try {
			System.out.println(m.id);
		} catch(Exception e) {
			System.out.println("Exception occured : " + e);
			m=new Member04();
			System.out.println("id " + m.id);
		}
	}
}
