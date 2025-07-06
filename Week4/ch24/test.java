import java.util.*;

public class test {
    public static void main(String[] args) {
        
        /** Linked list has a bunch of nodes that point (reference) to
        class nodes. Follow pointers from first reference to n element */
        LinkedList<String> namesLinkedList = new LinkedList<>();
        // these are great for adding/removing elements, take longer
        // to retrieve than ArrayList
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add(1, "Chuck");

        

        System.out.println(namesLinkedList.get(1));
        
        /** uses an array (fixed size) n number of elements
         * ArrayList does the work of dynamic size allotment
         * automatically creates a new array when the existing array
         * gets full 
         */
        ArrayList<String> namesArrayList = new ArrayList<>();
        // takes the same amount of time to return any element
        // no matter the index
        namesArrayList.add("Ringo");
        namesArrayList.add("George");
        System.out.println(namesArrayList.get(1));
        
        Collections.sort(namesArrayList);

        System.out.println(namesArrayList);

    }
}
