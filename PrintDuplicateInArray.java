package week3.day2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creation of List
	    List<Integer> duplicate = new LinkedList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
	    System.out.println("Input Array:  " + duplicate);
	    
	    for(int i = 0; i < duplicate.size(); i++) {
	    	
	    	for(int j = i+1; j < duplicate.size(); j++) {
	    		
	    		// Comparing i and j to find the duplicate
	    		
	    		if(duplicate.get(i) == duplicate.get(j)) {
	    			
	    			System.out.println("Duplicate element found" + duplicate.get(i));
	    		}
	    	}
	    }
	}

}
