package practice;

	public class Ex_03 {
		
		public static void main(String[] args) {
			int a;
			
			a=100;
			
//			System.out.println(a);
			
			a=200;
//			System.out.println(a);
			
			int x=10;
			int y=20;
			int tmp=0;
//			System.out.println("x = "+x+",y="+y);
			
			tmp=x;
			x=y;
			y=tmp;
			System.out.println("x = " + x + ", y = " + y);
		}
	}
