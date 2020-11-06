package publicpractice.oop;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex05 {

   public static void main(String[] args) {
	   Set<String> group2 = new HashSet<>();
	   Set<String> group3 = new HashSet<>();
	   Set<String> group4 = new HashSet<>();
	   
	   Random rand = new Random();
	   String[] ppl = {"±ÇµµÇõ", "±è¼öÁø", "±èÈ²±¸", "½Å°æ¼·", "ÀÌº´±Ô", "ÀÌ½Â·Ä"};
	   
	   for(int i=0; i<100; i++) {
		   int random1 = rand.nextInt(3)+2;
		   int random2 = rand.nextInt(6);
		   
		   System.out.println();
		   
		   if(!group2.contains(ppl[random2]) && 
			  !group3.contains(ppl[random2]) &&
			  !group4.contains(ppl[random2])) {
			   if(random1 == 2) {
				   if(!(group2.size() >= 3) && !group2.contains(ppl[random2])) {
					   group2.add(ppl[random2]);
				   } else {
					   continue;
				   }
			   } else if(random1 == 3) {
				   if(!(group3.size() >= 2) && !group3.contains(ppl[random2])) {
					   group3.add(ppl[random2]);
				   } else {
					   continue;
				   }
			   } else if(random1 ==4) {
				   if(!(group4.size() >= 1) && !group4.contains(ppl[random2])) {
					   group4.add(ppl[random2]);
				   } else {
					   continue;
				   }
			   }
		   } else {
			   continue;
		   }
		   
		   
	   }
	   
	   System.out.println("group 2 is " + group2.toString());
	   System.out.println("group 3 is " + group3.toString());
	   System.out.println("group 4 is " + group4.toString());
	   
   }
}