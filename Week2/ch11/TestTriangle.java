import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        // initialize scanner
        Scanner input = new Scanner(System.in);

        // for loop used to instantiate the triangle based on user input
        System.out.println("Enter the 3 sides of a triangle: ");
        double[] sides = {0.0, 0.0, 0.0};
        for(int i = 0; i <= 2; i++){
            System.out.println("Enter side " + (i+1) );
            double temp = input.nextDouble();
            sides[i] = temp;
        }
        Triangle triangle1 = new Triangle(sides[0], sides[1], sides[2]);

        // input to declare the color of the triangle
        System.out.println("Next, enter the color: ");
        String color = input.next(); 
        triangle1.setColor(color);

        // input to declare whether it is filled or not
        System.out.println("Finally, tell wheter it is filled: ");
        boolean filled = input.nextBoolean();
        triangle1.setFilled(filled);
        
        // outputs print all the data to the console
        System.out.println("triangle, " + triangle1.toString());
        System.out.println("triangle1 color is: " + triangle1.getColor());
        System.out.println("triangle1 is filled: " + triangle1.isFilled());
        
    }
}
