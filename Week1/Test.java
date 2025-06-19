public class Test {
    public static void main(String[] args) {
        long number = 1234567891234L;
        System.out.println(processLongAsInt(number));
    }

    public static long processLongAsInt(long n) {
        boolean shouldAdd = true;
        int sum = 0;
        while(n != 0) {
            int digit = (int)(n % 10);
            if(shouldAdd) { 
            sum += digit;        
            System.out.println("The sum is: " + sum);
            System.out.println("shouldAdd is: " + shouldAdd);
            }
            shouldAdd = !shouldAdd;
            n /= 10;
        }
        return sum;
}
}