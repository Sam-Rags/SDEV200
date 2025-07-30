import java.util.ArrayList;
import stringsCollections.StoreStrings;

public class TestStoreStrings {

	public static void main(String[] args) {
		ArrayList<String> states = new ArrayList<String>(); // added ArrayList object type String to left side & changed right side assignment from Integer to String
		states.add("Virginia");
		states.add("New York"); // added semicolon to complete statement
		states.add("Michigan");
//		states.add("Indiana");
		states.add("Missouri");
		states.add("Indiana");
		
		states.sort(null);
		
		for(String state:states) {
			
			if (StoreStrings.duplicateString(states)) {
				System.out.println("Error! Contains more than one entry of the same state in the list. Must have only one entry for the state in the list");
				break; // added break statement to keep from printing the error for every element in the list
			} else {
				System.out.println(state); // added semicolon to complete statement
				
		}
			
		} 
		/** moved this print statement to outside of for loop so it prints only once at the end
		 * also added some text to clarify exactly what it's doing
		 * */
		System.out.println("The number of unique states listed are: " + StoreStrings.count(states)); 
	}

}
