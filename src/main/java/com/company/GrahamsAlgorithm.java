package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static com.company.Util.isLeftTurn;

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
        return new ArrayList<>(convexHull);
    }

    public boolean isConvexHull(Stack<Point> convexHull) {
        List<Point> tmpHull = new ArrayList<>(convexHull);
        for (int i = 0; i < tmpHull.size() - 2; i++) {
            if (!isLeftTurn(tmpHull.get(i), tmpHull.get(i+1), tmpHull.get(i+2))) {
                return false;
            }
        }
        return true;
    }

    private List<Point> orderByPolarAngle(Point start, List<Point> points) {
        return new PolarAngleSort(start).sort(points);
    }

    public Point findStartPoint(List<Point> points) {
        List<Point> pointsOrderedByYValue = new VerticalSort().sort(points);
        if (points.get(0).getY() < points.get(1).getY()) {
            return points.get(0);
        }
        Point first = pointsOrderedByYValue.get(0);
        List<Point> lowestYPoints = new ArrayList<>();
        for (Point p : points) {
            if (p.getY() == first.getY()) {
                lowestYPoints.add(p);
            }
        }
        return new HorizontalSort().sort(lowestYPoints).get(0);
    }
}
