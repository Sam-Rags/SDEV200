import java.util.Scanner;

public class Exercise06_31 {
    

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        if(number % 10 == 0);
        return true;
    }

    /** Iterate the long number to process per digit as an int */
    public static long sumOfOddPlace(long number) {
        boolean shouldAdd = true;
        int sum = 0;
        while(number != 0) {
            int digit = (int)(number % 10);
            if(shouldAdd) { 
            sum += digit;        
           
            System.out.println("The odd sum is: " + sum + "\n");
            
        }
        shouldAdd = !shouldAdd;
        number /= 10;
    }
    return (int)(sum);    
}

    public static long sumOfDoubleEvenPlace(long number) {
        boolean shouldAdd = false;
        int sum = 0;
        while(number != 0) {
            int digit = (int)(number % 10);
            if(shouldAdd) {
            int digitSum = digit * 2;
                if(digitSum >= 10) {
                    int temp = (digitSum / 10) + (digitSum % 10);
                    System.out.println("Sum of temp is: " + temp);
                    sum += temp; 
                }     
            sum += digitSum;        
            System.out.println("The even sum is: " + sum + "\n");
            
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
        System.out.println("Sum is: " + sum);
        System.out.println("Result is: " + result);
        return result;
        }
        


    



public static void main(String[] args) {
        // Add scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number between 13 and 16 digits: ");
        long userNumber = input.nextLong();

        // System.out.println("The sum of " + userNumber + " is " + sumOfOddPlace(userNumber));

        long oddDigits = sumOfOddPlace(userNumber);
        long evenDigits = sumOfDoubleEvenPlace(userNumber);

        System.out.println("the value of evenDigits is: " + evenDigits);
        System.out.println("the value of oddDigits is: " + oddDigits);
    }
}





