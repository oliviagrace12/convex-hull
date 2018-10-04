package com.company;

import static com.company.Util.crossProduct;

/**
 * Created by oliviachisman on 10/1/18
 */
public class PolarAngleSort extends MergeSort {

    private final Point anchor;

    public PolarAngleSort(Point anchor) {
        this.anchor = anchor;
    }

    @Override
    protected boolean compare(Point p1, Point p2) {
        int crossProduct = crossProduct(anchor, p1, p2);
        if (crossProduct == 0) {
            return getDistance(anchor, p1) < getDistance(anchor, p2);
        }
        return crossProduct > 0;
    }

    private double getDistance(Point p1, Point p2) {
        return Math.sqrt(square(p2.getX() - p1.getX()) + square(p2.getY() - p1.getY()));
    }

    private double square(double x) {
        return x * x;
    }

}
