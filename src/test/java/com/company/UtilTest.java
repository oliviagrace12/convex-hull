package com.company;

import org.junit.Test;

/**
 * Created by oliviachisman on 10/2/18
 */
public class UtilTest {

    @Test
    public void testIsLeftTurn() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        Point p3 = new Point(2, 1);

        assert Util.isLeftTurn(p1,p3,p2);
    }

    @Test
    public void testIsLeftTurn2() {
        Point p1 = new Point(3, 1);
        Point p2 = new Point(4, 1);
        Point p3 = new Point(12, 1);

        assert !Util.isLeftTurn(p1,p3,p2);
    }
}
