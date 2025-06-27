import java.math.*;
import java.util.Scanner;
import java.lang.Comparable;

public class Exercise13_15 {
    public static void main(String[] args) {
      // Prompt the user to enter two Rational numbers
      Scanner input = new Scanner(System.in);
      System.out.print("Enter rational r1 with numerator and denominator seperated by a space: ");
      String n1 = input.next();
      String d1 = input.next();

      System.out.print("Enter rational r2 with numerator and denominator seperated by a space: ");
      String n2 = input.next();
      String d2 = input.next();

      RationalUsingBigInteger r1 = new RationalUsingBigInteger(
        new BigInteger(n1), new BigInteger(d1));
      RationalUsingBigInteger r2 = new RationalUsingBigInteger(
        new BigInteger(n2), new BigInteger(d2));

      // Display results
      System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
      System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
      System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
      System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
      System.out.println(r2 + " is " + r2.doubleValue());
    }
}

// Name the revised Rational class RationalUsingBigInteger 
class RationalUsingBigInteger extends Number 
    implements Comparable<RationalUsingBigInteger> {
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
      BigInteger n = this.numerator.multiply(secondRational.getDenominator())
      .add(secondRational.getNumerator().multiply(this.denominator));
      BigInteger d = this.denominator.multiply(secondRational.getDenominator());
      return new RationalUsingBigInteger(n, d); 
    }

    public RationalUsingBigInteger subtract(RationalUsingBigInteger secondRational) {
      BigInteger n = this.numerator.multiply(secondRational.getDenominator()).subtract(
        denominator).multiply(secondRational.getNumerator());
      BigInteger d = this.denominator.multiply(secondRational.getDenominator());
        return new RationalUsingBigInteger(n, d);
    }

    /** Multiply a rational number to this rational */
    public RationalUsingBigInteger multiply(RationalUsingBigInteger secondRational) {
      BigInteger n = numerator.multiply(secondRational.getNumerator()); 
      BigInteger d = denominator.multiply(secondRational.getDenominator());
      return new RationalUsingBigInteger(n, d);
    }

    public RationalUsingBigInteger divide(RationalUsingBigInteger secondRational) {
      BigInteger n = numerator.multiply(secondRational.getDenominator());
      BigInteger d = denominator.multiply(secondRational.getNumerator());
      return new RationalUsingBigInteger(n, d);
    }
    
    @Override
    public String toString() {
      if (denominator.equals(1))
        return numerator + "";
      else
        return numerator + "/" + denominator;
    }

    @Override // Implement the abstract intValue method in Number
    public int intValue() {
        return this.intValue(); 
    }
      
    @Override
    public float floatValue() {
      return this.floatValue();
    }

    @Override
    public double doubleValue() {
      return numerator.doubleValue() / denominator.doubleValue();
    }

    @Override
    public long longValue() {
      return this.longValue();
    }

    @Override // Implement the compareTo method in Comparable
    public int compareTo(RationalUsingBigInteger other) {
      RationalUsingBigInteger difference = this.subtract(other);
      return difference.numerator.compareTo(BigInteger.ZERO);
}


}


