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
     *
     * Only one not passing is case 5.
     */

    public static void main(String[] args) throws IOException {
        String fileName = "/Users/oliviachisman/dev/depaul/csc_421/convex-hull/src/main/resources/TestFiles-Graham/" +
                "case6.txt";
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));

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
