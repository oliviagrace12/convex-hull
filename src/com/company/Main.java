package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Write a program that implements Graham’s algorithm for computing the convex hull of a set of points S in the plane.
     *      - input: coordinates of the points in S (following the format in the input files on D2L)
     *      - output: coordinates of the points on the convex hull of S
     *
     * You can assume that the points in S are distinct.
     * For sorting the points, you need to code an O(n lg n)-time sorting algorithm.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("")));

        List<Point> points = new ArrayList<>();
        String line;

        while ((line = reader.readLine()) != null) {
            String[] nums = line.split(" ");
            points.add(new Point(Integer.valueOf(nums[0]), Integer.valueOf(nums[1])));
        }

        GrahamsAlgorithm grahamsAlgorithm = new GrahamsAlgorithm();
        List<Point> convexHull = grahamsAlgorithm.findConvexHull(points);

        convexHull.forEach(System.out::println);
    }
}
