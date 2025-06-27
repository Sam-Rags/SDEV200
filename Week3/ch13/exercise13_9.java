package Week3.ch13;


public class exercise13_9 {

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

    public class Circle extends GeometricObject {
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

        /* Print the circle info */
        public void printCircle() {
            System.out.println("The circle is created " + getDateCreated() + 
            " and the radius is " + radius);
        }
    }
}