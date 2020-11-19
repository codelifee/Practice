package try_catch;

public class Try01 {

	public static void main(String[] args) {
		int a=10, b01=0, b02=2, result=0;
		
		try {
			result=a/b02;
			System.out.println(result);
			
			result=a/b01;
			System.out.println(result);
		} catch(ArithmeticException ae) {
			ae.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
