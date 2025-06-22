public class ch9_9Test {

    public static void main(String[] args) {
          
        //no arg constructor
        RegularPolygon polygon1 = new RegularPolygon();
        System.out.println("the area of polygon1 is: " + polygon1.getArea());
        System.out.println("the perimeter of polygon1 is: " + polygon1.getPerimeter());

        System.out.println("\n");

        /** overload constructor takes 2 args & defauls x & y to 0 */
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        System.out.println("the area of polygon2 is: " + polygon2.getArea());
        System.out.println("the perimeter of polygon2 is: " + polygon2.getPerimeter());

        System.out.println("\n");

        /** overload constructor takes all 4 args, for n, side, x & y */
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("the area of polygon3 is: " + polygon3.getArea());
        System.out.println("the perimeters of polygon3 is: " + polygon3.getPerimeter());
    }
}