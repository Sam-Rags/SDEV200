package Week4.ch20;
import java.util.*;

public class Collections {
    public static void main(String[] args) {
        
        // Create collections using ArrayList
        Collection<String> c = new ArrayList<>();
        Collection<String> d = new ArrayList<>();

        // Add elements to the collections
        c.add("Apple");
        c.add("Banana");
        c.add("Tomato");

        d.add("Grapes");
        d.add("Kiwi");
        d.add("Strawberries");
        
        System.out.println("Collectio c: " + c);
        // add elements of d into the c collection
        c.addAll(d);

        // outputs verify the collection manipulations
        System.out.println("Collection c + d: " + c);
        System.out.println("Collection size: " + c.size());

        
        
    
    }
}

