package try_catch;

class UserException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public UserException(String str) {
		super(str);
	}
}

public class Try04 {
	
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
