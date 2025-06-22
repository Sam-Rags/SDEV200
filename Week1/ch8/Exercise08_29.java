import java.util.Scanner;

public class Exercise08_29 {
    public static void main(String[] args) {
        //Init scanner
        Scanner input = new Scanner(System.in);
        int m1[][] = new int[3][3];
        System.out.println("Enter " + m1.length + " rows and " + 
        m1[0].length + " columns ");
        for (int row = 0; row < m1.length; row++) {
            for (int column = 0; column < m1[row].length; column++) {
                m1[row][column] = input.nextInt();
            }
        }

        for(int i = 0; i <3; i++) {
            for(int j = 0; j <3; j++) {
                System.out.print(m1[i][j] + "");
            }
            System.out.println();
        }
    }    
}
