package stringsCollections; // corrected package name to stringsCollections

import java.util.ArrayList;

public class StoreStrings {
	
	public static int count(ArrayList <String> words) // corrected this to accept a String type ArrayList as an argument
    {
        int lSize = 0; // logic error: lSize should start counting from 0
        for (String word : words) {
        	lSize++;
        }
        
        return lSize;
    
    }
	
	public static boolean duplicateString(ArrayList <String> words) {
		boolean isDuplicateString = false; // False capitalization corrected to false
		
		ArrayList<String> items = new ArrayList<String>(); // ArrayList instance parameter added: "String"
		
        for(String word : words)
        {
            if (items.contains(word)) {
            	isDuplicateString = true; // True capitalization corrected to true
            }else {
            	items.add(word);
            }
        }
		
		
		return isDuplicateString;
		
	}
}
