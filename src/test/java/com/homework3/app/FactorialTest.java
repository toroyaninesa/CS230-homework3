package com.homework3.app;

import org.junit.Test;

import static org.mockito.ArgumentMatchers.anyInt;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class FactorialTest {
  @Test
  public void calculateFactorialOfZero() {
    assertEquals(1, MathUtils.calculateFactorial(0));
  }

  @Test
  public void calculateFactorialOfOne() {
    assertEquals(1, MathUtils.calculateFactorial(1));
  }

  @Test
  public void calculateFactorialOfPositiveNumber() {
    assertEquals(1, MathUtils.calculateFactorial(1));
    assertEquals(3628800, MathUtils.calculateFactorial(10));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCalculateFactorialOfNegativeNumber() {
    MathUtils.calculateFactorial(-5);
  }

  @Test
  public void testCalculateFactorialRecursiveCall() {
    MathUtils calculator = spy(new MathUtils());

    MathUtils.calculateFactorial(5);

    verify(calculator, atLeastOnce());
    MathUtils.calculateFactorial(anyInt());
  }

}
