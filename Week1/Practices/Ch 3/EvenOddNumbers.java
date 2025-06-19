import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pay = 25.00;
        System.out.println("Your current pay is: " + pay);

        System.out.println("Enter your score (1-100): ");
        int score = input.nextInt();

        if (score > 90) {
            pay = pay * 1.03;
            System.out.println("Great job, you get a 3% raise!");
        }
        else {
            pay = pay * 1.01;
            System.out.println("Too bad, you only get a 1% raise.");
        }
        
        System.out.print("Your new pay rate is: " + pay + "!");
    }
}
