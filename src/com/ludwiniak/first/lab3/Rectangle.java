package com.ludwiniak.first.lab3;


public class Rectangle {
    private Point pointA;
    Point pointB;

    public Rectangle() {}

    public Rectangle(Point pointA, Point pointB) {
            this.pointA = pointA;
            this.pointB = pointB;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public double getArea() {
        return getArea(this.pointA, this.pointB);
    }

    public double getArea(Point pA, Point pB) {
        double a = getLength(pA.getX(), pB.getX());
        double b = getLength(pA.getY(), pB.getY());

        return  a * b;
    }

    public double getCircuit(){
        double a = getLength(this.pointA.getX(), this.pointB.getX());
        double b = getLength(this.pointA.getY(), this.pointB.getY());

        return 2 * (a + b);
    }

    public double getDiagonal() {
        double a = getLength(this.pointA.getX(), this.pointB.getX());
        double b = getLength(this.pointA.getY(), this.pointB.getY());

        return Math.sqrt(a*a + b*b);
    }

    public static double getLength(double a, double b) {
        return Math.abs(a - b);
    }
}
