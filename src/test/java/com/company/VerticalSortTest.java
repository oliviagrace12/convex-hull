package com.company;

import com.company.sort.MergeSort;
import com.company.sort.VerticalSort;
import org.junit.Test;

import java.util.List;

/**
 * Created by oliviachisman on 10/2/18
 */
public class VerticalSortTest {

    @Test
    public void testMergeLists() {
        Point p1 = new Point(1,2);
        Point p2 = new Point(1,3);
        Point p3 = new Point(1,5);
        Point p4 = new Point(1,7);

        List<Point> list1 = List.of(p2, p3);
        List<Point> list2 = List.of(p1, p4);

        MergeSort sortAlgo = new VerticalSort();

        List<Point> mergedPoints = sortAlgo.merge(list1, list2);

        assert mergedPoints.get(0) == p1;
        assert mergedPoints.get(1) == p2;
        assert mergedPoints.get(2) == p3;
        assert mergedPoints.get(3) == p4;
    }

    @Test
    public void testSort() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        Point p3 = new Point(3, 3);

        List<Point> points = List.of(p3, p1, p2);

        MergeSort sortAlgo = new VerticalSort();

        List<Point> sortedPoints = List.of(p2, p3);

        List<Point> actual = sortAlgo.sort(points);

        assert actual.get(0) == p1;
        assert actual.get(1) == p2;
        assert actual.get(2) == p3;

    }
}
