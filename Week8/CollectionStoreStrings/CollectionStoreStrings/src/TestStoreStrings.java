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
		
		/** moved the for each loop to the else statement which will now correctly print the outputs whether the list has duplicates or not */			
		if (StoreStrings.duplicateString(states)) {
			System.out.println("Error! Contains more than one entry of the same state in the list. Must have only one entry for the state in the list");
		} else {
			for (String state : states) {
				System.out.println(state);
			}; // added semicolon to complete statement
			// the println method below now has some more information rather than just printing a digit
			System.out.println("The number of unique states listed are: " + StoreStrings.count(states));
		} 

	}

}
