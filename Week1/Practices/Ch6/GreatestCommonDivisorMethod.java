import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    // Main Method
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);

        // Prompt for 2 integers
        System.out.print("Enter the first integer:");
        int n1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int n2 = input.nextInt();

        System.out.println("The GCD for " + n1 + " and " + n2 +
        " is " + gcd(n1, n2));
        
    }

    // Return the GCD of two integers
    public static int gcd(int n1, int n2) {
        int gcd = 1; // Initial gcd is 1
        int k = 1; // Possible gcd

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k; // Update gcd
            k++;
        }

    return gcd; //return gcd
    }
}
