import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;

        System.out.print("Enter another integer: ");
        int y = input.nextInt();

        if (y > 0)
            x = 1;
            System.out.print("the value of x is: " + x + "!");
        
    }
}
