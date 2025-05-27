/*
    Description: QAP 2 - Problem 2 - TestMyRectangle Class
    Author: Joseph Gallant
    Date: May 27, 2025
 */

public class TestMyRectangle {
    public static void main(String[] args) {
        // Create two rectangles using the different constructors
        MyRectangle mr1 = new MyRectangle();
        MyRectangle mr2 = new MyRectangle(-4,4, 8, -4);
        MyRectangle mr3 = new MyRectangle(new MyPoint(8,8), new MyPoint(16,4));

        // Test of MyRectangle mr1 toString method.
        // Should return two points of (0,0)
        System.out.println("MyRetangle mr1 points: " + mr1);

        // Tests of MyRectangle mr2
        System.out.println("\nMyRectangle mr2 tests:");

        // Should return a point of (-4,4)
        System.out.println("getTopLeft: " + mr2.getTopLeft());

        mr2.setTopLeft(new MyPoint(-3,3));
        // Should return a point of (-3,3)
        System.out.println("getTopLeft after setTopLeft(new MyPoint(-3,3)): " + mr2.getTopLeft());

        mr2.setTopLeft(-4,4);
        // Should return a point of (-4,4)
        System.out.println("getTopLeft after setTopLeft(-4,4): " + mr2.getTopLeft());

        // Tests of MyRectangle mr3
        System.out.println("\nMyRectangle mr3 tests:");
        // Should return a point of (16,4)
        System.out.println("getBotRight: " + mr3.getBotRight());

        mr3.setBotRight(new MyPoint(-8,-7));
        // Should return a point of (-8,-7)
        System.out.println("getBotRight after setBotRight(new MyPoint(-8,-7)): " + mr3.getBotRight());

        mr3.setBotRight(16,4);
        // Should return a point of (16,4)
        System.out.println("getBotRight after setBotRight(16,4): " + mr3.getBotRight());

        // Get the area and perimeter of MyRectangle mr1
        // The value should be 0.0 in both cases
        System.out.println("\nMyRectangle mr1");
        System.out.println("getArea: " + mr1.getArea());
        System.out.println("getPerimeter: " + mr1.getPerimeter());

        // Get the area and perimeter of MyRectangle mr2
        // The values should be 96.0 and 40.0 respectively
        System.out.println("\nMyRectangle mr2");
        System.out.println("getArea: " + mr2.getArea());
        System.out.println("getPerimeter: " + mr2.getPerimeter());

        // Test of the toString method on all MyRectangle instances
        System.out.println("\ntoString method tests:");
        System.out.println("MyRectangle mr1: " + mr1);
        System.out.println("MyRectangle mr2: " + mr2);
        System.out.println("MyRectangle mr3: " + mr3);
    }
}
