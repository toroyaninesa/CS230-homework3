package com.homework3.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class AverageCalculatorTest {

    /**
     * Test case 1: Calculate average of positive numbers
     * Test case 2: Calculate average of negative numbers
     * Test case 3: Calculate average of mixed positive and negative numbers
     *  Test case 4: Calculate average of single number
     *  Test case 5: Calculate average of zero
     */
    @Test
    public void testCalculateAverage() {
        int[] case1 = {1, 2, 3, 4, 5};
        assertEquals(3.0, MathUtils.calculateAverage(case1), 0.001);

        int[] case2 = {-1, -2, -3, -4, -5};
        assertEquals(-3.0, MathUtils.calculateAverage(case2), 0.001);

        int[] case3 = {-1, 2, -3, 4, -5};
        assertEquals(-0.6, MathUtils.calculateAverage(case3), 0.001);

        int[] case4 = {10};
        assertEquals(10.0, MathUtils.calculateAverage(case4), 0.001);

        int[] case5 = {0, 0, 0, 0};
        assertEquals(0.0, MathUtils.calculateAverage(case5), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateAverageEmptyArray() {
        int[] numbers = {};
        MathUtils.calculateAverage(numbers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateAverageNullArray() {
        int[] numbers = null;
        MathUtils.calculateAverage(numbers);
    }
}