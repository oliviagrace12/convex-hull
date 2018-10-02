package com.company;

import static com.company.Util.isLeftTurn;

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
        return isLeftTurn(anchor, p1, p2);
    }

}
