import java.util.Scanner;

public class Exercise06_31 {
    

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        if(number % 10 == 0);
        return true;
    }

    //Iterate the long number to process per digit as an int
    public void processLongAsInt(long number) {
        boolean shouldAdd = false;
        int sum = 0;
        if(shouldAdd) {
            while (number != 0) { 
            int digit = (int)(number % 10);
            sum += digit;
            shouldAdd = !shouldAdd;
            number /= 10;
            
        
        getDigit(digit);
            }
        }         
    }
        

    //Returns the sum of the digits passed from processLongAsInt
    public static int getDigit(int number) {
        int result = number * 2;
        int sum = (result < 10) ? result : (result / 10) + (result % 10);
        System.out.println("Sum is: " + sum);
        System.out.println("Result is: " + result);
        }
        
        
    

    /** Get the result from Step 2 */
    // public static int sumOfDoubleEvenPlace(long number) {
    //     long result = 0;
    //     int tmp = 0;
    //     while(number > 0) {
    //         tmp = number % 10;
    //         result += tmp * tmp;
    //         number /= 10;
    //     }
    //     return result;
    // }

    /** Return this number if it is a single digit, otherwise
     * return the sum of the two digits
     */



public static void main(String[] args) {
        // Add scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number between 13 and 16 digits: ");
        long number = input.nextLong();

        
        // boolean shouldAdd = false;
        // int sum = 0;
        // while (number > 0) {
        //     int digit = (int)(number % 10);
        //     if(shouldAdd) {
        //         if(digit * 2 >= 10) {
        //             digit *= 2;
        //             sum += digit % 10;
                
                    
        //         // sum += ((digit / 10) + (digit % 10));
        //         System.out.println("Sum in digit >= 10 is: " + sum);   
        //         System.out.println("Digit >= 10 is: " + digit);
                
        //         }
        //         else if(digit * 2 < 10);
        //             sum += digit * 2;
        //     }
        //     shouldAdd = !shouldAdd;
        //     number /= 10;
        //     System.out.println("Digit is " + digit);
        //     System.out.println("Sum is: " + sum);
        // }
    

    }

    // /** Return sum of odd-place digits in number */
    // public static int sumOfOddPlace(long number) {
    //     return number;
    // }
    
    // /** Return the number of digits in d */
    // public static int getSize(long d) {
    //     return d;
    // }
    
    // /** Return the first k number of digits from the number.
    //  * If the number of digits is less than k, return number. */
    // public static long getPrefix(long number, int k) {
    //     return number;
    // }

    
        



        // int sum=0;
        // boolean shouldAdd = true;

        // while (number > 0) {
        //     int digit = (int)(number % 10);
        //     if (shouldAdd) {
        //         sum += digit;
        //     // System.out.println(sum);
        //     System.out.println(digit);
        //     }
        //     shouldAdd = !shouldAdd;
        //     number /= 10;
        // }
        

    



