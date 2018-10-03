package com.company;

import org.junit.Test;

import java.util.List;
import java.util.Stack;

/**
 * Created by oliviachisman on 10/3/18
 */
public class GrahamsAlgorithmTest {

    @Test
    public void testFindStartPoint() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        Point p3 = new Point(3, 3);

        List<Point> points = List.of(p1, p2, p3);

        assert new GrahamsAlgorithm().findStartPoint(points) == p1;
    }

    @Test
    public void testIsConvexHull() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        Point p3 = new Point(2, 1);

        Stack<Point> points = new Stack<>();
        points.push(p1);
        points.push(p2);
        points.push(p3);

        assert new GrahamsAlgorithm().isConvexHull(points);
    }
}
