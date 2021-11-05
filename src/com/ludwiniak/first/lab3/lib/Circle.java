package com.ludwiniak.first.lab3.lib;

import com.ludwiniak.first.lab3.Point;


public class Circle {

    private final Point point;
    private final double r;

    public Point getPoint() {
        return point;
    }


    public double getR() {
        return r;
    }

    public Circle(Point point, double r){
        this.point = point;

        this.r = r;
    }

    public double getArea() {
        return Math.PI * (r * r);
    }

    public double getCircuit() {
        return  2 * Math.PI * r;
    }

    public int getPosition() {
        if(point.getX() > 0 && point.getY() > 0) {
            return 1;
        }
        if(point.getX() <= 0 && point.getY() > 0) {
            return 2;
        }
        if(point.getX() <= 0 && point.getY() <= 0) {
            return 3;
        }
        return 4;
    }

}
