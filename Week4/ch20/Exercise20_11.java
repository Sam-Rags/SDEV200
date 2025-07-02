package Week4.ch20;
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise20_11 {
    public static void main(String[] args) {
        // add scanner
        Scanner input = new Scanner(System.in);
        if (args.length == 0) {
            System.out.println("Please provide a Java file as an argument.");
            return;
        }
        // accept cmd line argument as a file    
        String filename = args[0];
        // String fileContent = Files.readString(Paths.get(filename));
        // try-catch block to parse the selected file into a String
        try {
            String fileContent = Files.readString(Paths.get(filename));
            System.out.println("File loaded successfully!");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    
        // create & populate arrays for open & close brackets
        ArrayList<Character> openBrackets =new ArrayList<>();
        ArrayList<Character> closeBrackets = new ArrayList<>();

        openBrackets.add('[');
        openBrackets.add('{');
        openBrackets.add('(');
        closeBrackets.add(']');
        closeBrackets.add('}');
        closeBrackets.add(')');
        
        
    

        // Stack<String> bracketStack = new Stack<>();
        // int i = 0;
        // for( i = 0; i < fileContent.length() -1; i++) {
        //     char currentChar = fileContent.charAt(i);
        //     if ( openBrackets.contains(i) ) {
        //         System.out.println("i is: " + i);
        //     }
        

    }
    
    }







// public static boolean validateSymbols(File file) throws Exception {
//     // array of all symbols in Java to be checked
//     String[] javaSymbols = {"[", "]", "{", "}", "(", ")"}; 

//     // placeholder return statement, this will either return true or false
//     return true;
// }

