package stringsCollections; // corrected package name to stringsCollections

import java.util.ArrayList;
import java.util.Iterator;

public class StoreStrings {
	
	public static int count(ArrayList <String> words)
    {
		Iterator<String> iterator = words.iterator();
        int lSize = 0; // logic error: lSize should start counting from 0
        while ( iterator.hasNext() ) 
        {
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
