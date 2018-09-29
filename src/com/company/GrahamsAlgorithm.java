package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by oliviachisman on 9/29/18
 */
public class GrahamsAlgorithm {

    public List<Point> findConvexHull(List<Point> points) {
        Point start = findStartPoint(points);
        points.remove(start);

        List<Point> pointsOrderedByPolarAngle = orderByPolarAngle(start, points);

        Stack<Point> convexHull = new Stack<>();
        convexHull.push(start);
        convexHull.push(pointsOrderedByPolarAngle.get(0));
        pointsOrderedByPolarAngle.remove(0);

        for (Point point : pointsOrderedByPolarAngle) {
            convexHull.push(point);
            while (!isConvexHull(convexHull)) {
                convexHull.pop();
                convexHull.pop();
                convexHull.push(point);
            }
        }
        return null;
    }

    private boolean isConvexHull(Stack<Point> convexHull) {
        List<Point> tmpHull = new ArrayList<>(convexHull);
        for (int i = 0; i < tmpHull.size() - 2; i++) {
            if (!isLeftTurn(tmpHull.get(i), tmpHull.get(i+1), tmpHull.get(i+2))) {
                return false;
            }
        }
        return true;
    }

    private boolean isLeftTurn(Point po, Point pi, Point pj) {
        return crossProduct(po, pi, pj) > 0;
    }

    private int crossProduct(Point po, Point pi, Point pj) {
        return (pi.getX() - po.getX()) * (pj.getY() - po.getY()) - (pj.getX() - po.getX()) * (pj.getY() - po.getY());
    }

    private List<Point> orderByPolarAngle(Point start, List<Point> points) {
        // todo
        return null;
    }

    private Point findStartPoint(List<Point> points) {

        return null;
    }
}
