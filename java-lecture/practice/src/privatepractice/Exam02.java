package privatepractice;

public class Exam02{
	
    public static void main(String[] args){
     int sum=add(new int[]{100,90,100});
     
     
     System.out.println("�迭���� ����="+sum);
    }
     
    public static int add(int[] score) {
    	int sum=0;
    	
    	for(int arr:score) {
    		sum += arr;
    	}
    	
    	return sum;
   }


}
