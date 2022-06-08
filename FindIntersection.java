package week3.day2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create List
		
		List<Integer> array1 = new LinkedList<Integer>(Arrays.asList(3,2,9,4,6,7));
		List<Integer> array2 = new LinkedList<Integer>(Arrays.asList(1,2,4,8,7));	
		
		// Loop using the length of first array
		
		for (int i = 0; i < array1.size(); i++) {
			
			// Loop using the length of first array
			
			for (int j = 0; j < array2.size(); j++) {
				
				// comparing the two variables and printing variable of array
				
				if(array1.get(i) == array2.get(j)) {
					
					System.out.println("Intersection : " + array1.get(i));
				}
			}
		}

	}

}
