public class TestArrayArguments {
    public static void main(String[] args) {
        int x = 1; // x represents an int value
        int[] y = new int[10]; // y represents an array of int values

        System.out.println("Initial value of x " + x);
        System.out.println("Value of y[0] is " + y[0]);

        m(x, y); //invoke m with x & y as arguments

        System.out.println("x is " + x);
        System.out.println("y[0] is now " + y[0]);

    }

    public static void m(int number, int[] numbers) {
        number = 1001; // assign a new value to number
        numbers[0] = 5555; // assign a new value to numbers[0]
    }   

}