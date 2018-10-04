package com.company;

import com.company.sort.MergeSort;
import com.company.sort.PolarAngleSort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oliviachisman on 10/2/18
 */
public class PolarAngleSortTest {

    @Test
    public void testSort() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        Point p3 = new Point(2, 1);

        List<Point> points = new ArrayList<>();
        points.add(p2);
        points.add(p3);

        MergeSort sortAlgo = new PolarAngleSort(p1);

        List<Point> actual = sortAlgo.sort(points);

        assert actual.get(0) == p3;
        assert actual.get(1) == p2;
    }


}
