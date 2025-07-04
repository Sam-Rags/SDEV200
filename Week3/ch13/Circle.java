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
