package com.company;

/**
 * Created by oliviachisman on 10/1/18
 */
public class Util {

    public static boolean isLeftTurn(Point po, Point pi, Point pj) {
        return crossProduct(po, pi, pj) > 0;
    }

    private static int crossProduct(Point po, Point pi, Point pj) {
        return (pi.getX() - po.getX()) * (pj.getY() - po.getY()) - (pj.getX() - po.getX()) * (pi.getY() - po.getY());
    }
}
