/*
    Description: QAP 2 - Problem 1 - MyPoint Class
    Author: Joseph Gallant
    Dates: May 22, 2025
 */

public class MyPoint {
    // Private attributes
    private int x;
    private int y;

    // Constructors
    // Default
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Method to set the X and Y coordinates using two parameters
    public void setXY (int x, int y) {
        this.x = x;
        this.y = y;
    }

    // toString method overload
    public String toString() {
        return ("(" + this.x + "," + this.y + ")");
    }

    // Calculate and return the distance between two points
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;

        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    // Calculate and return the distance between the current point and another point
    public double distance (MyPoint p) {
        int xDiff = this.x - p.x;
        int yDiff = this.y - p.y;

        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    // Calculate and return the distance between the current point and (0, 0)
    public double distance () {
        int xDiff = this.x;
        int yDiff = this.y;

        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

}
