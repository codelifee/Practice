package try_catch;


public class Try03 {
	
	public static void p(int a) throws NullPointerException{
		if(a == 0) {
			throw new NullPointerException();
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("before p()");
			p(0);
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
	}
}
