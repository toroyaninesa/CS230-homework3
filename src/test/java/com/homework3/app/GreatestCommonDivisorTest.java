package com.homework3.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorTest {

  @Test
  public void testGCDPositiveNumbers() {
    assertEquals(4, MathUtils.greatestCommonDivisor(12, 8));
    assertEquals(1, MathUtils.greatestCommonDivisor(17, 8));
    assertEquals(5, MathUtils.greatestCommonDivisor(25, 15));
  }

  @Test
  public void testGCDNegativeNumbers() {
    assertEquals(4, MathUtils.greatestCommonDivisor(-12, -8));
    assertEquals(1, MathUtils.greatestCommonDivisor(-17, -8));
    assertEquals(5, MathUtils.greatestCommonDivisor(-25, -15));
  }

  @Test
  public void testGCDMixedNumbers() {
    assertEquals(4, MathUtils.greatestCommonDivisor(-12, 8));
    assertEquals(1, MathUtils.greatestCommonDivisor(-17, 8));
    assertEquals(5, MathUtils.greatestCommonDivisor(25, -15));
  }

  @Test
  public void testGCDFirstNumberZero() {
    assertEquals(5, MathUtils.greatestCommonDivisor(0, 5));
    assertEquals(1, MathUtils.greatestCommonDivisor(0, 1));
    assertEquals(10, MathUtils.greatestCommonDivisor(0, 10));
  }

  @Test
  public void testGCDSecondNumberZero() {
    assertEquals(3, MathUtils.greatestCommonDivisor(3, 0));
    assertEquals(1, MathUtils.greatestCommonDivisor(1, 0));
    assertEquals(12, MathUtils.greatestCommonDivisor(12, 0));
  }

  @Test
  public void testGCDBothNumbersZero() {
    assertEquals(0, MathUtils.greatestCommonDivisor(0, 0));
  }

  @Test
  public void testGCDNoCommonDivisors() {
    assertEquals(1, MathUtils.greatestCommonDivisor(17, 8));
    assertEquals(1, MathUtils.greatestCommonDivisor(25, 7));
  }
}

