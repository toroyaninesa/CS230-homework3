package com.homework3.app;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class MathUtils
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    /**
     * Method is used for calculating the factorial of a number
     * @param n
     * @return
     */
    public static int calculateFactorial(int n) {
        if(n < 0) throw new IllegalArgumentException("Can't calculate factorial of negative number");

        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    /**
     * Method is used to find the largest element in the array
     * @param array
     * @return
     */
    public static int findLargest(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        Arrays.sort(array);
        return array[array.length - 1];
    }

    /**
     * Method is used to calculate the average of the elements in the array
     * @param numbers
     * @return
     */
    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.length;
    }

    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
             return Math.abs(a);
        }
        int result = greatestCommonDivisor(b, a % b);
        return Math.abs(result);
    }
}
