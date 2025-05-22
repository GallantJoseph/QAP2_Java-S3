/*
    Description: QAP 2 - Problem 1 - TestMyLine Class
    Author: Joseph Gallant
    Dates: May 22, 2025
 */

public class TestMyLine {
    public static void main(String[] args) {
        // Create two lines using the different constructors
        MyLine ml1 = new MyLine(1, 0, 2, 3);
        MyLine ml2 = new MyLine(new MyPoint(0, 1), new MyPoint(2, 4));

        System.out.println("MyLine ml1 tests:");

        // Begin values should be x=1, y=0
        System.out.println("getBegin(): " + ml1.getBegin());
        ml1.setBegin(new MyPoint(-1, 2));

        // Begin values after should be x=-1, y=2
        System.out.println("getBegin() after setBegin: " + ml1.getBegin());

        // End values should be x=2, y=3
        System.out.println("\ngetEnd(): " + ml1.getEnd());
        ml1.setEnd(new MyPoint(3, 5));

        // End values after should be x=3, y=5
        System.out.println("getEnd() after setEnd: " + ml1.getEnd());

        // Begin x=-1
        System.out.println("\ngetBeginX(): " + ml1.getBeginX());
        ml1.setBeginX(7);

        // Begin after, x=7
        System.out.println("getBeginX() after setBeginX: " + ml1.getBeginX());

        // Begin y=2
        System.out.println("\ngetBeginY(): " + ml1.getBeginY());
        ml1.setBeginY(8);

        // Begin after, y=8
        System.out.println("getBeginY() after setBeginY: " + ml1.getBeginY());

        // End x=3
        System.out.println("\ngetEndX(): " + ml1.getEndX());
        ml1.setEndX(7);

        // End after, x=7
        System.out.println("getEndX() after setEndX: " + ml1.getEndX());

        // End y=5
        System.out.println("\ngetEndY(): " + ml1.getEndY());
        ml1.setEndY(1);

        // End after, y=1
        System.out.println("getEndY() after setEndY: " + ml1.getEndY());

        // Begin values should be x=7, y=8
        int[] xyBegin = ml1.getBeginXY();
        System.out.println("\ngetBeginXY() array values (x,y): (" + xyBegin[0] + "," + xyBegin[1] + ")");
        ml1.setBeginXY(1, 3);

        // Begin values after should be x=1, y=3
        xyBegin = ml1.getBeginXY();
        System.out.println("getBeginXY() array values after (x,y): (" + xyBegin[0] + "," + xyBegin[1] + ")");

        // End values should be x=7, y=1
        int[] xyEnd = ml1.getEndXY();
        System.out.println("\ngetEndXY() array values (x,y): (" + xyEnd[0] + "," + xyEnd[1] + ")");
        ml1.setEndXY(5, 9);

        // End values after should be x=5, y=9
        xyEnd = ml1.getEndXY();
        System.out.println("getEndXY() array values after (x,y): (" + xyEnd[0] + "," + xyEnd[1] + ")");

        // Get the length of MyLine ml2
        System.out.printf("\nLength of MyLine ml2: %.2f", ml2.getLength());

        // Get the gradient of MyLine ml2
        System.out.printf("\nGradient of MyLine ml2 in radians: %.2f", ml2.getGradient());

        // MyLine ml2 toString
        System.out.println("\nMyLine ml2 toString(): " + ml2);
    }
}
