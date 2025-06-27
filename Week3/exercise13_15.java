import java.math.*;
import java.util.Scanner;

public class exercise13_15 {
  public static void main(String[] args) {
    // Prompt the user to enter two Rational numbers
    Scanner input = new Scanner(System.in);
    System.out.print("Enter rational r1 with numerator and denominator seperated by a space: ");
    String n1 = input.next();
    String d1 = input.next();

    System.out.print("Enter rational r2 with numerator and denominator seperated by a space: ");
    String n2 = input.next();
    String d2 = input.next();

    RationalUsingBigInteger r1 = new RationalUsingBigInteger(new BigInteger(n1), new BigInteger(d1));
    RationalUsingBigInteger r2 = new RationalUsingBigInteger(new BigInteger(n2), new BigInteger(d2));

    // Display results
    System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
    System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
    System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
    System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
    System.out.println(r2 + " is " + r2.doubleValue());
  }
}

// Name the revised Rational class RationalUsingBigInteger 
class RationalUsingBigInteger extends Number {
    // implements Comparable<RationalUsingBigInteger> {
  // Data fields for numerator and denominator
  private BigInteger numerator = BigInteger.ZERO;
  private BigInteger denominator = BigInteger.ONE;



        /** Construct a rational with default properties */
        public RationalUsingBigInteger() {

        }

        /** Construct a rational with specified numerator and denominator */
        public RationalUsingBigInteger(BigInteger numerator, BigInteger denominator) {
            BigInteger gcd = numerator.gcd(denominator);
            this.numerator = numerator;
            this.denominator = denominator.abs().divide(gcd);
        }

        /** Find GCD of two numbers */
        // private static BigInteger gcd(BigInteger n, BigInteger d) {
        //     BigInteger n1 = n.abs();
        //     BigInteger n2 = d.abs();
        //     BigInteger gcd = 1;

        //     for (BigInteger k = 1; k <= n1 && k <= n2; k++) {
        //         if (n1 % k == 0 && n2 % k == 0)
        //             gcd = k;
        //     }
        // 
        //     return gcd;
        // }

        /** Return numerator */
        public BigInteger getNumerator() {
            return numerator;
        }

        /** Return denominator */
        public BigInteger getDenominator() {
            return denominator;
        }

        /** Add a rational number to this rational */
        public RationalUsingBigInteger add(RationalUsingBigInteger secondRational) {
            BigInteger n = this.numerator.multiply(secondRational.getDenominator()).add( 
            denominator.multiply(secondRational.getNumerator()));
            BigInteger d = this.denominator.multiply(secondRational.getDenominator());
            return new RationalUsingBigInteger(n, d); // is this right?
        }

        /** Multiply a rational number to this rational */
        public RationalUsingBigInteger multiply(RationalUsingBigInteger secondRational) {
            BigInteger n = numerator.multiply(secondRational.getNumerator()); //what is this?
            BigInteger d = denominator.multiply(secondRational.getDenominator());
            return new RationalUsingBigInteger(n, d);
        }

        /** Divide a rational number from this rational */
        public RationalUsingBigInteger divide(RationalUsingBigInteger secondRational) {
            BigInteger n = numerator.multiply(secondRational.getDenominator());
            BigInteger d = denominator.multiply(secondRational.numerator);
            return new RationalUsingBigInteger(n, d);
        }

        public RationalUsingBigInteger subtract(RationalUsingBigInteger secondRational) {
            BigInteger n = numerator.multiply(secondRational.getDenominator());
            BigInteger d = denominator.multiply(secondRational.numerator);
            return new RationalUsingBigInteger(n, d);
        }

        @Override // override toString()
        public String toString() {
            if (denominator.equals(1)) 
                return numerator + "";
           else
            return numerator + "/" + denominator;
        }

        @Override // Override the equals method in Object class
        public boolean equals() {
            if ((this.subtract((Rational)(other))).getNumerator() == 0)
                return true;
            else return false; // Some problems in this code block
        }

        @Override // Implement the abstract intValue method in Number
        public int intValue() {
            return value.intValue();
        }

        @Override // Implement the abstract floatvalue method in Number
        public float floatValue() {
            return (float)doubleValue();
        }

        @Override // Implement the doubleValue method in Number
        public BigInteger doubleValue() {
            return numerator.multiply(1).divide(denominator);
        }

        @Override // Implement the abstract longValue method in Number
        public long longValue() {
            return (long)doubleValue();
        }

        @Override // Implement the compareTo method in Comparable
        public int compareTo(T o) {
            if (this.subtract(o).getNumerator() > 0)
                return 1;
            else if (this.subtract(o).getNumerator() < 0)
                return -1;
            else
                return 0;
        }
        
}

