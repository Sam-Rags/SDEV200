import java.util.*;
import java.io.*;

public class CountKeywords {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        if (args.length == 0) {
        System.out.println("You must run this program with a java file as argument.");
        return;
        }
        String filename = args[0];

        File file = new File(filename);
        
        System.out.println("The number of keywords in " + filename + 
        " is " + countKeywords(file));

    }
    


public static int countKeywords(File file) throws Exception {
    // Array of all Java keywords + true, false & null
    String[] keywordString = {"abstract", "assert", "boolean", 
        "break", "byte", "case", "catch", "char", "class", "const",
        "continue", "default", "do", "double", "else", "enum", 
        "extends", "for", "final", "finally", "float", "goto", 
        "if", "implements", "import", "instanceof", "int", 
        "interface", "long", "native", "new", "package", "private",
        "protected", "public", "return", "short", "static", 
        "strictfp", "super", "switch", "synchronized", "this", 
        "throw", "throws", "transient", "try", "void", "volatile", 
        "while", "true", "false", "null"};
    
    // Array of comment strings used in loop to omit counting keywords
    String[] commentStrings = {"//", "/**", "*/", "*"};

    Set<String> commentSet =
        new HashSet<>(Arrays.asList(commentStrings));
    
    Set<String> keywordSet =
        new HashSet<>(Arrays.asList(keywordString));
    int count = 0;
    
    Scanner input = new Scanner(file);
    
    /** while loop w/ nested if statements that will overlook lines where there are comment strings
     * will otherwise increment and return the count of keywords */
    while (input.hasNext()) {
        String word = input.next();
        if ( commentSet.contains(word) ) {
            word = input.nextLine();
            continue;
        }
        if ( keywordSet.contains(word) ) {
            System.out.println(word + " " );
            count++;
        }
    
    }  
    return count;
    }
}
