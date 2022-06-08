package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Storing inputs in list
		
				List<Integer> FindingSecondLargestNum = new ArrayList<Integer>(Arrays.asList(3,2,9,4,6,7));
				
				// Sorting the list using collection
				
			    Collections.sort(FindingSecondLargestNum);
			    
			    // printing the second largest number
			    
			    System.out.println("Second Largest Number is : " + FindingSecondLargestNum.get(FindingSecondLargestNum.size() - 2 ));

		
			}

}
