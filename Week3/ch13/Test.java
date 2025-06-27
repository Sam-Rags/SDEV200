
public class Test {
    public static void main(String[] args) {

        Circle c1 = new Circle(5);
        Circle c2 = new Circle(5);
        
        Circle c3 = new Circle(2);
        
        System.out.println("Circle c1 has radius: " + c1.getRadius());

        System.out.println("Circle c2 has radius: " + c2.getRadius());
        
        System.out.println("Cirlce c3 has radius: " + c3.getRadius());
        

        System.out.println("c1 & c2 are equal: " + c1.equalTo(c2));
        System.out.println("c1 & c3 are equal: " + c1.equalTo(c3));
    }

    @Override
    public String toString() {
        return "Test{" + '}';
    }

    public Test() {
    }
}

    public class Circle extends GeometricObject implements Comparable {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    @Override /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public boolean equalTo(Circle other) {
        return this.radius == other.getRadius();
    }

    /* Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + 
        " and the radius is " + radius);
        }
    }

    public abstract class GeometricObject {
        private String color = "white";
        private boolean filled;
        private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color & filled value */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
    * the get method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** get Date Created */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Created on " + dateCreated + "\ncolor: " + color +
        " and filled: " + filled;
    }

        /** Abstract method getArea */
        public abstract double getArea();

        /** Abstract method getPerimeter */
        public abstract double getPerimeter();
        
    }

        
    public interface Comparable {
        boolean equalTo(Circle other);
    }

