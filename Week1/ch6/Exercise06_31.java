import java.util.Scanner;

public class Exercise06_31 {
    

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        return number % 10 == 0;
    }

    /** doubles every even place digit from right & divides by 2
     * if the sum of the digit is >= 10, adds all digits
      */
    public static long sumOfDoubleEvenPlace(long number) {
        boolean shouldAdd = false;
        int sum = 0;
        while(number != 0) {
            int digit = (int)(number % 10);
            if(shouldAdd) {
                if(digit * 2 >= 10) {
                    int temp = digit * 2;
                    temp = ((temp % 10) + (temp / 10));
                    sum += temp; 
                } else if(digit * 2 < 10) {
                    sum += (digit * 2);
                }                 
            }
            shouldAdd = !shouldAdd;
            number /= 10;
        }
        return (int)(sum);   
    }
        
    //Returns the sum of the digits passed from processLongAsInt
    public static int getDigit(int number) {
        int result = number * 2;
        int sum = (result < 10) ? result : (result / 10) + (result % 10);
        return result;
    }

    /** adds every odd place digit from the right */
    public static long sumOfOddPlace(long number) {
        boolean shouldAdd = true;
        int sum = 0;
        while(number != 0) {
            int digit = (int)(number % 10);
            if(shouldAdd) { 
            sum += digit;                  
        }
        shouldAdd = !shouldAdd;
        number /= 10;
    }
    return (int)(sum);    
    }

    /** Return true if the number d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        String numString = Long.toString(number);
        String prefix = Integer.toString(d);
        return numString.startsWith(prefix);
    }

    /** Return the number of digits in d */
    public static long getSize(long d) {
        int size = 0;
        while(d != 0) {
            long counter = d % 10;
            d /= 10;
            size += 1;
        }
        return size;
    }

    /** Return the first k number of digits from number. If the
    * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k) {
        String numStr = Long.toString(number);
        if (numStr.length() <= k) {
            return number;
        }
        return Long.parseLong(numStr.substring(0, k));
    }
        
public static void main(String[] args) {
        // Add scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number as a long integer: ");
        long userNumber = input.nextLong();

        // adds the odd & even digit math
        long oddDigits = sumOfOddPlace(userNumber);
        long evenDigits = sumOfDoubleEvenPlace(userNumber);
        long number = evenDigits + oddDigits;

        //output declaring whether a valid credit card number has been inputted
        System.out.println(userNumber + " " + isValid(number));
    }
}