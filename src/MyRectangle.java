/*
    Description: QAP 2 - Problem 2 - MyRectangle Class
    Author: Joseph Gallant
    Date: May 27, 2025
 */

public class MyRectangle {
    // Private attributes
    // Top Left corner and bottom right corner
    private MyPoint topLeft;
    private MyPoint botRight;

    // Constructors
    // Default
    public MyRectangle() {
        this.topLeft = new MyPoint();
        this.botRight = new MyPoint();
    }

    // Parameterized
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.botRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint botRight) {
        this.topLeft = topLeft;
        this.botRight = botRight;
    }

    // Getters and Setters
    // Top Left
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(int x, int y) {
        this.topLeft.setXY(x, y);
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    // Bottom Right
    public MyPoint getBotRight() {
        return botRight;
    }

    public void setBotRight(int x, int y) {
        this.botRight.setXY(x, y);
    }

    public void setBotRight(MyPoint botRight) {
        this.botRight = botRight;
    }

    // Get the area of the rectangle
    public double getArea() {
        int width = this.botRight.getX() - this.topLeft.getX();
        int height =  this.topLeft.getY() - this.botRight.getY();

        return (double) width * height;
    }

    // Get the perimeter of the rectangle
    public double getPerimeter() {
        int width = this.botRight.getX() - this.topLeft.getX();
        int height =  this.topLeft.getY() - this.botRight.getY();

        return (double) 2 * (width + height);
    }

    // toString method overload
    public String toString() {
        return ("MyRectangle[topLeft=" + this.topLeft + ", botRight=" + this.botRight + "]");
    }
}
