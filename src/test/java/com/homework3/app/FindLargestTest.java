package com.homework3.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindLargestTest {

  /**
   *  Test case 1: Array with positive numbers
   *  Test case 2: Array with negative numbers
   *  Test case 3: Array with mixed positive and negative numbers
   *  Test case 4: Array with single element
   *  Test case 5: Array with zero
   */
    @Test
    public void testFindLargest() {
      int[] array1 = {3, 8, 2, 5, 10};
      assertEquals(10, MathUtils.findLargest(array1));


      int[] array2 = {-3, -8, -2, -5, -10};
      assertEquals(-2, MathUtils.findLargest(array2));

      int[] array3 = {-3, 8, -2, 5, -10};
      assertEquals(8, MathUtils.findLargest(array3));

      int[] array4 = {5};
      assertEquals(5, MathUtils.findLargest(array4));

      int[] array5 = {0, 0, 0, 0};
      assertEquals(0, MathUtils.findLargest(array5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindLargestNullArray() {
      int[] arr = null;
      MathUtils.findLargest(arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindLargestEmptyArray() {
      int[] arr = {};
      MathUtils.findLargest(arr);
    }
}
