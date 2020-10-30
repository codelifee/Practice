package data;

public class Data06 {
	public static void main(String[] args) {
//		float var5=123456.78912345f;
//	    double var6 = 123456.7891234567891011;
//
//	    var5=(float)var6;
//	    var6=var5;
//	    System.out.printf("%f, %f\n",var5,var6);
//	    
//	    var6=(double)var5;//자동형변환
//	     System.out.println(var5+" , "+var6);
	    
	    
	    double var5=123456.78912345;
	    double var6=123456.7891234567891011;
	      
	     System.out.println("first var 5: "+var5 + " originNumber : " + 123456.78912345);
	     System.out.println("first var 6: "+var6 + " originNumber : " + 123456.7891234567891011);
	      var5=(float)var6;
	      var6=(double)var5;
	     System.out.println("var5=(float)var6: "+var5);
	     System.out.println("var6=(double)var5: "+var6);
		     
	     System.out.printf("printf var5=(float)var6 : %f \n",var5 );
	     System.out.printf("printf var6=(double)var5 : %f ",var6);
	}
}
