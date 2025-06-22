public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {
        n = 3;
        side = 1;
        x = 0.0;
        y = 0.0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0.0;
        this.y = 0.0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getNumberOfSides() {
        return n;
    }

    public double getSides() {
        return this.side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int setNumberOfSides(int n) {
        this.n = n;
        return n;
    }

    public int setSide(int side) {
        this.side = side;
        return side;
    }

    public int setX(int x) {
        this.x = x;
        return x;
    }

    public int setY(int y) {
        this.y = y;
        return y;
    }

    public int getPerimeter() {
        return (int)n * (int)side;
    }

    public double getArea() {
        double area = (((n) * (side * side)) / (4 * Math.tan(Math.PI/n)));
        return area;
    }

}
