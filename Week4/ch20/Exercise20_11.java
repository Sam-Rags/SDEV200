import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.File;

import java.util.*;

public class exercise20_11 {
    public static void main(String[] args) throws Exception {
        // validation loop to make sure the user runs this with a file as argument
        if (args.length == 0) {
        System.out.println("You must run this program with a java file as argument.");
        return;
        }
        
        /** takes the path arguement and turns it into a string. It will be converted
         * to a charArray in the below method. */
        Path path = Paths.get(args[0]);
        String javaFile = Files.readString(path);
        
        // terminal print that runs the methhod validateSymbols and returns true or false
        System.out.println("the file: " + path + " is valid? " + validateSymbols(javaFile));
    }

    public static Boolean validateSymbols(String s) throws Exception {
        
        // create and populate 2 ArrayLists with opener & closer brackets, using same index
        ArrayList<Character> openBrackets = new ArrayList<>();
        openBrackets.add('[');
        openBrackets.add('{');
        openBrackets.add('(');

        ArrayList<Character> closeBrackets = new ArrayList<>();
        closeBrackets.add(']');
        closeBrackets.add('}');
        closeBrackets.add(')');

        // create a charArray from the input file for iteration
        char[] input = s.toCharArray();
        int i = 0;
        Stack<Character> bracketStack = new Stack<Character>();

        /** for loop that checks whether an opening bracket is the current char
         * then adds it to the bracketStack stack. When it encounters a closing bracket
         * it checks whether the closing bracket matches the top opening bracket
         * if true it proceeds, if false it breaks out of the loop and returns false
         */ 
        for ( i = 0; i < input.length; i++) {
            char currentChar = input[i];
            if (openBrackets.contains(currentChar)) {
                bracketStack.push(currentChar); 
            }
            else if (closeBrackets.contains(currentChar)) {
                if (bracketStack.isEmpty())
                return false;
                char top = bracketStack.peek();
                int closerIndex = closeBrackets.indexOf(currentChar);
                char expectedOpener = openBrackets.get(closerIndex);
                if ( top == expectedOpener) {
                    bracketStack.pop();
                } else {
                    return false;
                }
                
            }
        }
        return true;         
        }
        
    }

