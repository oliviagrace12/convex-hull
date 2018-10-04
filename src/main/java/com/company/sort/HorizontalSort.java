package com.company.sort;

import com.company.Point;
import com.company.sort.MergeSort;

/**
 * Created by oliviachisman on 10/1/18
 */
public class HorizontalSort extends MergeSort {
    @Override
    protected boolean compare(Point p1, Point p2) {
        return p1.getX() < p2.getX();
    }
}
