package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "sampath";

		// converting string to character
		char[] characters = input.toCharArray();
		// Creation of HashSet
		Set<Character> hashset = new HashSet<Character>();

		// Looping using the length of the character move to next character
		for (int i = 0; i < characters.length; i++)

		{
			// verifying the same characters is available
			if (hashset.contains(characters[i])) 
			{
				// if it so removing that character
				hashset.remove(characters[i]);

			} else 
			{
				// if not add the character to the set
				hashset.add(characters[i]);

			}
		}
		// printing the set
		System.out.println(hashset);


	}

}
