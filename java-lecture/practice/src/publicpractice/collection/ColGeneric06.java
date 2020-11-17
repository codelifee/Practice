package publicpractice.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class ColGeneric06 {

	public static void main(String[] args) {
		int[] score = {100,90,80,90,80};
		List<Integer> scoreList = new ArrayList<>();
		int sum=0;
		double avg=0;
		
		
		for(int i=0; i<score.length; i++) {
			scoreList.add(score[i]);
		}
		
		for(Integer item : scoreList) {
			sum += item;
		}
			
		avg = sum/scoreList.size();
				
		System.out.println(sum);
		
		
		System.out.println(avg);
		
		int max=scoreList.get(0);
		int min=scoreList.get(0);
		
		for(Integer item : scoreList) {
			if(item > max) {
				max =item;
			} else if(item < min) {
				min = item;
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}
}
