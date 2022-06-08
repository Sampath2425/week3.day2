package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Removing duplicates using set
		
				Set<Integer> removeDuplicates = new LinkedHashSet<Integer>(Arrays.asList(4, 6, 7, 2, 3, 1, 9, 10, 8, 8, 6, 2));
				System.out.println(removeDuplicates);
				
				// Converting the set to list to sort the list
				
				List<Integer> sorting = new ArrayList<Integer>(removeDuplicates);
				Collections.sort(sorting);
				System.out.println(sorting);
				
				// Getting first number from the sorted array
				
				int expectedNumber = sorting.get(0);
				System.out.println(expectedNumber);
				
				// iterating from 0 with length
				
				for (int i = 0; i < sorting.size();) {
					
					// Checking the expected number and sorting is equal. if condition is true increment
					// the i to 1
					
					if(expectedNumber == sorting.get(i)) {
						
						i++;
					}
					// If a condition is fails then print the missing numbers
					else {
						System.out.println("Missing Number is : " + expectedNumber);
					}
					
					//after the if else condition increment the expected number to 1 to compare with next number
					
					expectedNumber++;
				}

	}

}
