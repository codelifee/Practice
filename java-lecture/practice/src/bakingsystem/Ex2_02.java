package bakingsystem;

class Mt02{
	void pr(int... a) {
		for(int arr :a) {
			System.out.println(arr);
		}
	}
}
public class Ex2_02 {
	public static void main(String[] args) {
       Mt02 m=new Mt02();
       m.pr(10);
       m.pr(10, 20);
	}
}
