package com.upskilling.w01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DayOneExercisesTest {

    @Test
    void shouldCalculateBmi() {
        var calculator = new BmiCalculator();
        assertEquals(22.86, calculator.calculateBmi(70.0, 1.75), 0.01);
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateBmi(0, 1.75));
    }

    @Test
    void shouldSwapNumbers() {
        var swapper = new NumberSwapper();
        assertArrayEquals(new int[]{20, 10}, swapper.swapWithTemp(10, 20));
        assertArrayEquals(new int[]{20, 10}, swapper.swapWithoutTemp(10, 20));
    }

    @Test
    void shouldCalculateFinalPriceWithDiscountAndTax() {
        var priceCalculator = new PriceCalculator();
        assertEquals(104.4, priceCalculator.calculateFinalPrice(100.0, 10.0, 16.0), 0.001);
    }

    @Test
    void shouldBreakDownSeconds() {
        var breakdown = new TimeBreakdown();
        assertArrayEquals(new int[]{1, 2, 3}, breakdown.fromSeconds(3723));
    }

    @Test
    void shouldComputeRectangleAreaAndPerimeter() {
        var metrics = new RectangleMetrics();
        assertEquals(15.0, metrics.area(3.0, 5.0), 0.0001);
        assertEquals(16.0, metrics.perimeter(3.0, 5.0), 0.0001);
    }

    @Test
    void shouldHandleTypeCastingAndByteOverflow() {
        var castingLab = new TypeCastingLab();
        assertEquals(9, castingLab.truncateToInt(9.99));
        assertTrue(castingLab.willByteOverflow(130));
        assertEquals((byte) -126, castingLab.castIntToByte(130));
        assertFalse(castingLab.willByteOverflow(100));
    }

    @Test
    void shouldCalculateSimpleAndCompoundInterest() {
        var interest = new InterestCalculator();
        assertEquals(150.0, interest.simpleInterest(1000.0, 5.0, 3), 0.001);
        assertEquals(1157.625, interest.compoundTotal(1000.0, 5.0, 3), 0.001);
    }

    @Test
    void shouldCalculateWeightedAverage() {
        var gradeCalculator = new WeightedGradeCalculator();
        assertEquals(86.0, gradeCalculator.weightedAverage(80.0, 0.4, 90.0, 0.6), 0.001);
    }

    @Test
    void shouldCheckParityAndBitwiseShift() {
        var bitwise = new BitwiseUtils();
        assertTrue(bitwise.isEven(8));
        assertFalse(bitwise.isEven(7));
        assertEquals(20, bitwise.multiplyByPowerOfTwo(5, 2));
    }
}