package Week3.ch13;

public class exercise13_15 {

    public class Rational extends Number {
        private long numerator = 0;
        private long denominator = 1;

        /** Construct a rational with default properties */
        public Rational() {

        }

        /** Construct a rational with specified numerator and denominator */
        public Rational(long numerator, long denominator) {
            long gcd = gcd(numerator, denominator);
            this.numerator = numerator;
            this.denominator = Math.abs(denominator) / gcd;
        }

        /** Find GCD of two numbers */
        private static long gcd(long n, long d) {
            long n1 = Math.abs(n);
            long n2 = Math.abs(d);
            int gcd = 1;

            for (int k = 1; k <= n1 && k <= n2; k++) {
                if (n1 % k == 0 && n2 % k == 0)
                    gcd = k;
            }

            return gcd;
        }

        /** Return numerator */
        public long getNumerator() {
            return numerator;
        }

        /** Return denominator */
        public long getDenominator() {
            return denominator;
        }

        /** Add a rational number to this rational */
        public Rational add(Rational secondRational) {
            long n = numerator * secondRational.getDenominator() + 
            denominator * secondRational.getNumerator();
            long d = denominator * secondRational.getDenominator();
            return new Rational(n, d); // is this right?
        }

        /** Multiply a rational number to this rational */
        public Rational multiply(Rational secondRational) {
            long n = void; //what is this?
            long d = denominator * secondRational.getDenominator();
            return new Rational(n, d);
        }

        /** Divide a rational number from this rational */
        public Rational divide(Rational secondRational) {
            long n = numerator * secondRational.getDenominator();
            long d = denominator * secondRational.numerator;
            return new Rational(n, d);
        }

        @Override // override toString()
        public String toString() {
            if (denominator == 1) 
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
            return (int)doubleValue();
        }

        @Override // Implement the abstract floatvalue method in Number
        public float floatValue() {
            return (float)doubleValue();
        }

        @Override // Implement the doubleValue method in Number
        public double doubleValue() {
            return numerator * 1.0 / denominator;
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

}