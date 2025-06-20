package Week2.exercise11dot1;

public class Triangle extends GeometricObject {
    public double side1 = 1;
    public double side2 = 1;
    public double side3 = 1;

   Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
   }

   public Triangle() {
       side1 = 1;
       side2 = 1;
       side3 = 1;
   }

   // method to find the area of a triangle
    public double getArea() {
        return 2.0; 
        // (base * height) /2;
    }

    // method to find the perimeter of a triangle
    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    // toString returns a description of the triangle
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
        " side3 = " + side3;
    }
}