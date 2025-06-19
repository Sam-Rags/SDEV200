import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        //Create scanner object
        Scanner input = new Scanner(System.in);

        //Declare constants
        final double KILOMETERS_PER_MILE = 1.609; 

        //Declare variable
        double miles = 100;

        //Compute KM to Miles
        double kilometers = miles * KILOMETERS_PER_MILE;

        //Display result
        System.out.println("kilometers are " + kilometers);
        
    }
}
