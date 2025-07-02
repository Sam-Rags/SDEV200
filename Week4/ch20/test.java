package Week4.ch20;
import java.util.*;

public class test {
    public static void main(String[] args) {
        TreeSet<String> firstBraces = new TreeSet<>();
        TreeSet<String> secondBraces = new TreeSet<>();

        firstBraces.add("[");
        firstBraces.add("(");
        firstBraces.add("{");

        firstBraces.add("]");
        firstBraces.add(")");
        firstBraces.add("}");
    
        Iterator<String> it = firstBraces.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // String testString = "a test [(])";
        
        // int i = 0;        
        // for (i = 0; i < testString.length(); i++) {
        //     char j = testString.charAt(i);
        //     String s = Character.toString(j);
        //     System.out.println(firstBraces.contains(s));  
        // }
    }
}

