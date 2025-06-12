import java.util.Scanner;

public class FahrenheitToCelsisus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        //Convert Fahrenheit to Celsius
        double celsisu = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenhet " + fahrenheit + " is " +
         celsisu + " in Celsius");
    }    
}
