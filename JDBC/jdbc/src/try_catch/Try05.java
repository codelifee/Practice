package try_catch;

public class Try05 {
	
	public static void main(String[] args) {
		
		try {
			int a=-11;
			if(a <= 0) {
				throw new UserException("this is not an odd number");
			}
		} catch(UserException e) {
			System.out.println(e.getMessage());
		}
	}
}
