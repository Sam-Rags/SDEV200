import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        //Check if the year is a leap year
        boolean isLeapYear = 
            (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        //Display result in a message
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}
