import java.util.Scanner;

public class useBMIClass {
    public static void main(String[] args) {
        // New scanner
        Scanner input = new Scanner(System.in);
        BMI bmi1 = new BMI("Person 1", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is " 
        + bmi1.getBMI() + " " + bmi1.getStatus());
    
        BMI bmi2 = new BMI("Person 2", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is " +
            bmi2.getBMI() + " " + bmi2.getStatus() + " and the age is: "
            + bmi2.getAge());

        }

static class BMI { 
    private String name;
    private int age;
    private double weight; // in pounds
    private double height; // in inches
    public final static double KILOGRAMS_PER_POUND = 0.45359237;
    public final static double METERS_PER_INCH = 0.0254;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    public double getBMI() {
        double bmi = weight * KILOGRAMS_PER_POUND /
            (( height * METERS_PER_INCH) * (height *METERS_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}

}
