/*
    Description: QAP 2 - Problem 1 - MyLine Class
    Author: Joseph Gallant
    Date: May 22, 2025
 */

public class MyLine {
    // Private attributes
    private MyPoint begin;
    private MyPoint end;

    // Constructors
    // Parameterized
    // Takes each point value individually
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    // Takes two MyPoint objects
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Begin/End MyPoint Getters and Setters
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Begin Getters and Setters
    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    // End Getters and Setters
    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    // Begin/End XY Getters and Setters
    public int[] getBeginXY() {
        return new int[] {this.begin.getX(), this.begin.getY()};
    }

    public void setBeginXY(int x, int y) {
        this.begin.setXY(x, y);
    }

    public int[] getEndXY() {
        return new int[] {this.end.getX(), this.end.getY()};
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    // Methods
    // Return the length between begin and end points
    public double getLength() {
        return this.begin.distance(this.end);
    }

    // Return the gradient in radians
    public double getGradient() {
        double yDiff = this.end.getY() - this.begin.getY();
        double xDiff = this.end.getX() - this.begin.getX();
        return Math.atan2(yDiff, xDiff);
    }

    // toString method override
    public String toString() {
        return ("MyLine[begin=" + this.begin.toString() + ",end=" + this.end.toString() + "]");
    }
}