package com.company;

import com.company.MergeSort;
import com.company.Point;
import com.company.PolarAngleSort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oliviachisman on 10/2/18
 */
public class PolarAngleSortTest {

    @Test
    public void sortTest() {
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);
        Point p3 = new Point(3,3);

        List<Point> points = new ArrayList<>();
        points.add(p3);
        points.add(p2);

        MergeSort sortAlgo = new PolarAngleSort(p1);

        List<Point> sortedPoints = new ArrayList<>();
        points.add(p2);
        points.add(p3);

        assert sortAlgo.sort(points) == sortedPoints;
    }
}
