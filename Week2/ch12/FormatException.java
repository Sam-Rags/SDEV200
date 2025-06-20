package Week2.ch12;
import java.util.Scanner;

public class FormatException {
    public static void main(String[] args) throws BinaryFormatException {
        // initiate scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary value to convert to decimal: ");
        String binaryString = input.nextLine();
        System.out.println("The value of " + binaryString + " is " +
        bin2Dec(binaryString));
    
    }
    public static String bin2Dec(String binaryString) throws BinaryFormatException {
        /** validates input to contain only 0 || 1 and then converts
         * to decimal
         * else throws BinaryFormatExcpetion */
        if (binaryString.matches("[01]+")) {
        int decimalOutput = Integer.parseInt(binaryString, 2);
        String decimalString = String.valueOf(decimalOutput);
        return decimalString;
        }
        else
            throw new BinaryFormatException("Not a binary number.");
    }

// custom exception declaration extends NumberFormatException
public static class BinaryFormatException extends NumberFormatException {
    public BinaryFormatException(String message) {
        super(message);
    }
}

}
