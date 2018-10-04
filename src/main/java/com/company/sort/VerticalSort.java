package com.company.sort;

import com.company.Point;

/**
 * Created by oliviachisman on 10/1/18
 */
public class VerticalSort extends MergeSort {

    @Override
    protected boolean compare(Point p1, Point p2) {
        return p1.getY() < p2.getY();
    }
}
