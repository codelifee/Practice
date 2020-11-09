package publicpractice.oop;

import java.util.ArrayList;
import java.util.List;

class ArzAPI {
	int sum1=0;
   
	public List<Integer> integerToArray(int... integer) {
		List<Integer> list = new ArrayList<>();
		
		while(!(integer.length == 0)) {
			list.add(integer.toString());
		}
		
		return list;
	}
	
	int sum(int integer) {
		List<Integer> input = this.integerToArray(integer);
		input.forEach((in) -> 
			sum1 += in
				);
		return sum1;
	}
	
	int sum(int[] integer) {
		int sum2 =0;
		int[] arr = integer;
		for(int i=0; i<arr.length; i++) {
			sum2 += arr[i];
		}
		return sum2;
	}
	
//  int sum(int... arr) {
//  int sum=0;
//  for(int i=0; i<arr.length; i++) {
//     sum += arr[i];
//  }
//  return sum;
//}

}

public class Ex06 {
   public static void main(String[] args) {
      
      ArrAPI api = new ArrAPI();
      int[] values1 = {1,2,3};
      int result = api.sum(values1);
      System.out.println("������: "+result);
      
      result = api.sum(new int[] {1,2,3,4,5});
      System.out.println("������: "+result);
   }
}